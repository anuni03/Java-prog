public class Stack {
    private Node top;
    private int height;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public Stack(int value){
        Node newnode=new Node(value);
        top=newnode;
        height=1;
    }
    public void printstack(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    } 
    public void getTop(){
        System.out.println("Top: "+top.value);
    }
    public void getheight(){
        System.out.println("Height: "+height); 
    }
    public void push(int value){
        Node newnode=new Node(value);
        if(height==0){
            top=newnode;
        }
        else{
            newnode.next=top;
            top=newnode;
        }
        height++;
    }
    public Node pop(){
        if(height==0)
        return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }
    public static void main(String args[]){
        Stack myStack=new Stack(5);
        myStack.getTop();
        myStack.getheight();
        myStack.printstack();
        System.out.println("New list");
        myStack.push(6);
        myStack.push(3);
        myStack.printstack();
        myStack.pop();
        System.out.println("New list after popping an element");
        myStack.printstack();
    }
    
}
