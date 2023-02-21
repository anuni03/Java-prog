import java.util.*;
public class itemincommoneff {
public static boolean itemcommome(int[] arr1,int[] arr2){
    HashMap<Integer,Boolean> myHashMap=new HashMap<>();
    for(int i:arr1){
        myHashMap.put(i, true);
    }
    for(int j:arr2){
        if(myHashMap.get(j)!=null)
        return true;
    }
    return false;
}
public static void main(String args[]){
    itemincommoneff itc=new itemincommoneff();
    int array1[]={4,6,8};
         int array2[]={1,3,8};
         System.out.println(itc.itemcommome(array1, array2));
}
    
}
