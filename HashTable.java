import java.util.ArrayList;

public class HashTable {
private int size=7;
private Node[] datamap;
public class Node{
    private String key;
    private int value;;
    private Node next;
   public Node(String key,int value){
    this.key=key;
    this.value=value;
   }
}
public HashTable(){
    datamap=new Node[size];
}
public void printTable(){
    for(int i=0;i<datamap.length;i++){
        System.out.println(i+" : ");
        Node temp=datamap[i];
        while(temp!=null){
            System.out.println(" { "+temp.key+" = "+temp.value+" } ");
            temp=temp.next;
        }
    }
}
private int hash(String key){
    int hash=0;
    char[] keychars=key.toCharArray();
    for(int i=0;i<keychars.length;i++){
        int asciivalue=keychars[i];
        hash=(hash+asciivalue*23)%datamap.length;
    }
    return hash;
}
public void set(String key,int value){
    int index=hash(key);
    Node newnode=new Node(key,value);
    if(datamap[index]==null){
        datamap[index]=newnode;
    }
    else{
        Node temp=datamap[index];
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
}
public int get(String key){
    int index=hash(key);
    Node temp=datamap[index];
    while(temp!=null){
        if(temp.key==key)
        return temp.value;
        temp=temp.next;
    }
    return 0;
}
public ArrayList keys(){
    ArrayList<String> allkeys=new ArrayList<>();
    for(int i=0;i<datamap.length;i++){
        Node temp=datamap[i];
        while(temp!=null){
            allkeys.add(temp.key);
            temp=temp.next;
        }

    }
    return allkeys;
}
public static void main(String args[]){
    HashTable myHashTable=new HashTable();
    myHashTable.printTable();
    int val=myHashTable.hash("paint");
    System.out.println(val);
     myHashTable.set("cream",300);
    myHashTable.set("eyeliner", 200);
    myHashTable.set("compact",250);
    myHashTable.set("lipstick",150);
    myHashTable.set("eyeshadow",200);
    myHashTable.printTable();
    System.out.println(myHashTable.get("compact"));
    System.out.println(myHashTable.get("mascarra"));
    myHashTable.set("paints",20);
    myHashTable.set("bolts", 40);
    myHashTable.set("nails",100);
    myHashTable.set("tile",50);
    myHashTable.set("lumber",80);
    myHashTable.printTable();
System.out.println(myHashTable.keys());
    

}
    
}
