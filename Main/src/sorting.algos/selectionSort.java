package sorting.algos;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {54,5,23,87,5,6,8,98,32,8};
        sort(arr,arr.length-1,0,0);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr, int r, int c, int greatest){
        if(r==0){
            return;
        }
        else if(r>=c){
            if(arr[c]>arr[greatest]){
                greatest = c;
            }
            sort(arr,r,++c,greatest);
        }
        else {
            swap(arr,greatest,r);
            sort(arr,r-1,0,0);
        }
    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
