import java.io.*;
import java.util.*;

 class dll {
    private Node head;
    private Node tail;
    private int length;
    class Node{
        Node next;
        Node prev;
        int value;
        Node(int value){
            this.value=value;
        }
    }
    public dll(int value){
        Node newnode =new Node(value);
        head=newnode;
        tail=newnode;
        length=1;
    }
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void gethead(){
        System.out.println("Head value:"+head.value);
    }
    public void gettail(){
        System.out.println("Tail value:"+tail.value);
    }
    public void getlen(){
        System.out.println("Length of linked list "+length);
    }
    public void append(int value){
        Node newnode=new Node(value);
        if(length==0){
            head=newnode;
            tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
        length++;
    }
    public Node removelast(){
        if(length==0)
        return null;
        Node temp=tail;
        if(length==1){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
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
            head.prev=newnode;
            head=newnode;
        }
        length++;
    }
    public Node removefirst(){
        if(length==0)
        return null;
        Node temp=head;
        if(length==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
            temp.next=null;

        }
        length--;
        return temp;
    }
      public Node get(int index){
        if(index<0||index>=length)
        return null;
        Node temp=head;
        if(index<length\2){
            for(int i=0;i<index;i++)
            temp=temp.next;
}
else{
    temp=tail;
    for(int i=length-1;i>index;i--)
    temp=temp.prev;
}
return temp;
    }
    public static void main(String args[]){
    dll mydll=new dll(7);
    mydll.append(8);
    mydll.printList();
    mydll.gethead();
    mydll.getlen();
    System.out.println("Removing list");
    System.out.println(mydll.removelast().value);
    System.out.println(mydll.removelast().value);
    System.out.println(mydll.removelast());
    mydll.append(8);
    mydll.append(9);
    mydll.prepend(4);
    System.out.println("New list");
    mydll.printList();
    System.out.println("First item "+mydll.removefirst().value);
    System.out.println("Getting item at 1 "+mydll.get(1).value);
    }
}
