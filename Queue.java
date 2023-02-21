public class Queue {
    private Node first;
    private Node last;
    private int length;
    class Node {
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public Queue(int value){
        Node newnode=new Node(value);
        first=newnode;
        last=newnode;
        length=1;
    }
    public void printQueue(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void getFirst(){
        System.out.println("First: "+first.value);
    }
    public void getLast(){
        System.out.println("Last: "+last.value);
    }
    public void getlen(){
        System.out.println("Length: "+length);
    }
    public void enqueue(int value){
        Node newnode=new Node(value);
        if(length==0){
            first=newnode;
            last=newnode;
        }
        else{
            last.next=newnode;
            last=newnode;
        }
        length++;
    }
    public Node dequeue(){
        if(length==0)
        return null;
        Node temp=first;
        if(length==1){
            first=null;
            last=null;
        }
        else{
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
    public static void main(String args[]){
        Queue myqueue=new Queue(7);
        myqueue.getFirst();
        myqueue.getLast();
        myqueue.getlen();
        myqueue.printQueue();
        myqueue.enqueue(8);
        myqueue.enqueue(4);
        System.out.println("Queue: ");
        myqueue.printQueue();
        System.out.println("Dequeued element: "+myqueue.dequeue().value);
        myqueue.printQueue();

    }
}
