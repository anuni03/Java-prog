import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class treeTraversal {
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

    /**
     * @return
     */
    public ArrayList<Integer> BFS(){
        Node currentnode=root;
        Queue<Integer> queue=new LinkedList<Integer>();
        ArrayList<Integer> results=new ArrayList<>();
        queue.add(currentnode);
        while(queue.size()>0){
            currentnode=queue.remove();
        results.add(currentnode.value);
            if(currentnode.left!=null)
            queue.add(currentnode.left);
            if(currentnode.right!=null)
            queue.add(currentnode.right);
        }
        return results;
        
    }
    public static void main(String args[]){
        treeTraversal mybst=new treeTraversal();
        mybst.insert(47);
        mybst.insert(21);
        mybst.insert(18);
        mybst.insert(76);
        mybst.insert(27);
        mybst.insert(52);
        mybst.insert(82);
        
        System.out.println(mybst.BFS());
    }
}
