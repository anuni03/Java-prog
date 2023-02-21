import java.util.Arrays;

public class quicksort {
    public static void swap(int[] array,int fi,int sc){
        int temp=array[fi];
        array[fi]=array[sc];
        array[sc]=temp;
    } 
    public static int pivot(int[] array,int pivotintdex,int endindex){
        int swapindex=pivotintdex;
        for(int i=pivotintdex+1;i<=endindex;i++){
            if(array[i]<array[pivotintdex]){
                swapindex++;
                swap(array,swapindex,i);
            }
        }
        swap(array,pivotintdex,swapindex);
        return swapindex;
    }
    public static void quickSortHelper(int[] array,int left,int right){
        if(left<right){
            int pivotindex=pivot(array, left, right);
            quickSortHelper(array, left, pivotindex-1);
            quickSortHelper(array, pivotindex+1, right);
        }
    }
    public static void quickSort(int[] array){
        quickSortHelper(array, 0, array.length-1);
    }
    public static void main(String args[]){
        int[] myarray={4,6,1,7,3,2,5};
        quickSort(myarray);
        System.out.println("Sorted Array: "+Arrays.toString(myarray));
    }
}
