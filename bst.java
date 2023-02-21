public class bst {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }
    public boolean insert(int value){
        Node newnode=new Node(value);
        if(root ==null){
            root=newnode;
            return true;
        }
        Node temp=root;
        while(true){
            if(newnode.value==temp.value)
            return false;
            if(newnode.value<temp.value){
                if(temp.left==null){
                    temp.left=newnode;
                    return true;
                    
                }
                temp=temp.left;
             }
             else{
                if(temp.right==null){
                    temp.right=newnode;
                    return true;
                }
                temp=temp.right;
             }
        }
    }
    public boolean contains(int value){
        Node temp=root;
        while(temp!=null){
            if(value<temp.value)
            temp=temp.left;
            else if(value>temp.value)
            temp=temp.right;
            else 
            return true;
        }
        return false;
    }
    public boolean rContains(Node currentnode,int value){
        if(currentnode==null) 
        return false;
        if(currentnode.value==value)
        return true;
        else if(currentnode.value>value)
        return rContains(currentnode.left, value);
        else
        return rContains(currentnode.right,value);
    }
    public boolean check(int val){
  return rContains(root, val);
    }
    
    public static void main(String args[]){
        bst mybst=new bst();
        System.out.println("Root: "+mybst.root);
        mybst.insert(7);
        mybst.insert(4);
        mybst.insert(9);
        mybst.insert(6);
        System.out.println(mybst.root.left.right.value);
        System.out.println(mybst.contains(6));
        System.out.println(mybst.contains(8));
        System.out.println(mybst.check(6));
        System.out.println(mybst.check(8)); 
   }
    
}
