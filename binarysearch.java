public class binarysearch {
    public boolean binary(int arr[],int find){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(find==arr[mid])
                return true;
        if(find<arr[mid])
        r=mid-1;
        else
        l=mid+1;

        }
        return false;
    }
    public static void main(String args[]){
        binarysearch obj=new binarysearch();
        int arr[]={2,3,5,7,8,10,23,34,56,67,78,88,92,100};
        System.out.println(obj.binary(arr, 8));
        System.out.println(obj.binary(arr, 66));
    }
}
