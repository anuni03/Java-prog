public class rbst {
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        Node(int value){
            this.value=value;
        }
    }
    private Node rInsert(Node currentNode,int value){
        if(currentNode==null)
        return new Node(value);
        if(currentNode.value>value)
        currentNode.left=rInsert(currentNode.left,value);
        else if(currentNode.value<value)
        currentNode.right=rInsert(currentNode.right, value);
        return currentNode;
    }
    

public void rInsert(int value){
    if(root==null)
    root=new Node(value);
    rInsert(root, value);
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
public boolean rContains(int val){
return rContains(root, val);
}
public int minvalue(Node currentNode){
    while(currentNode.left!=null){
        currentNode=currentNode.left;
    }
    return currentNode.value;
}
private Node deleteNode(Node currentNode,int value){
if(currentNode==null) /*IF node is not present in bst */
{
    return null;
}
else if(value<currentNode.value)
{
    currentNode.left=deleteNode(currentNode.left, value);
}
else if(value>currentNode.value){
    currentNode.right=deleteNode(currentNode.right, value);
}
else{ /*four cases arise over here  */
if(currentNode.left==null&&currentNode.right==null){
    return null;
}
else if(currentNode.left==null){
    currentNode=currentNode.right;
}
else if(currentNode.right==null){
    currentNode=currentNode.left;
}
else{  /*When node to be deleted is a internal node */
  int subTreeMin=minvalue(currentNode.right);
  currentNode.value=subTreeMin;
  currentNode.right=deleteNode(currentNode.right, value); /*Delete duplicate node */

}
}
return currentNode;
}
public void deleteNode(int value){
    deleteNode(root, value);
}
public static void main(String args[]){
    rbst myrbst=new rbst();
    myrbst.rInsert(2);
    myrbst.rInsert(1);
    myrbst.rInsert(3);
    System.out.println("Root: "+myrbst.root.value);
    System.out.println("Root->left: "+myrbst.root.left.value);
    System.out.println("Root->right: "+myrbst.root.right.value);
    System.out.println(myrbst.rContains(2));
    System.out.println(myrbst.rContains(5));
    System.out.println("Minimum element in tree: "+myrbst.minvalue(myrbst.root));
    myrbst.deleteNode( 2);
    myrbst.deleteNode( 5);
    System.out.println("Root: "+myrbst.root.value);
    System.out.println("Root->left: "+myrbst.root.left.value);
    System.out.println("Root->right: "+myrbst.root.right);
    


}
}
