public class itemincommon {
    public static boolean itemcommon(int[] arr1,int[] arr2 ){
        for(int i:arr1){
            for(int j:arr2){
                if(i==j)
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
         itemincommon itc=new itemincommon();
         int array1[]={4,6,8};
         int array2[]={1,3,8};
         System.out.println(itc.itemcommon(array1, array2));
    }
}
