import java.io.*;
public class ll {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        Node(int value){
            this.value=value;
        }
    }
    public ll(int value){
        Node newnode=new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (tail == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
    public void append(int value){
        Node newnode=new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
        length++;
    }
    public Node removelast(){
        if(length==0)
        return null;
        Node temp=head;
        Node pre=head;
        while(temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newnode=new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        length++;
    }
    public Node removefirst(){
        if(length==0)
        return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0)
        tail=null;
        return temp;
    }
    public Node get(int index){
        if(index>0||index>=length)
        return null;
        Node temp=head;
        for(int i=0;i<length;i++){
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value){
        Node temp=get(index);
        if(temp!=null){
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value){
        if(index<0||index>length){
            return false;
        }
        if(index==0){
            prepend(value);
            return true;
        }
        if(index==length){
            append(value);
            return true;
        }
        Node newnode =new Node(value);
        Node temp=get(index-1);
        newnode.next=temp.next;
        temp.next=newnode;
        length++;
        return true;
    }
    public Node remove(int index){
        if(index<0||index>=length)
        return null;
        if(index==0)
        return removefirst();
        if(index==length-1)
        return removelast();
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    public void reverse(){
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<length;i++){
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }
    }

    /**
     * @param args
     */
    public static void main(String args[]){
        ll myLinkedList=new ll(4);
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        myLinkedList.append(6);
        System.out.println("\n New Linked List:");
        myLinkedList.printList();
        System.out.println("Remove last:"+myLinkedList.removelast().value);
        System.out.println("Remove last:"+myLinkedList.removelast().value);
        System.out.println("Remove last:"+myLinkedList.removelast());
        System.out.println("new list");
        myLinkedList.append(7);
        myLinkedList.append(9);
        myLinkedList.prepend(3);
        myLinkedList.printList();
        System.out.println("list after removing first");
        myLinkedList.removefirst();
        myLinkedList.printList();
        System.out.println("Value at index 1: "+myLinkedList.get(1).value);
        myLinkedList.set(1,6);
        myLinkedList.printList();
        myLinkedList.insert(1, 4);
        System.out.println("Ater inserting value at index 1");
        myLinkedList.printList();
        myLinkedList.remove(1);
        System.out.println("Ater removing value at index 1");
        myLinkedList.printList();
        myLinkedList.reverse();
        System.out.println("Reversing list");
        myLinkedList.printList();


    }
}
