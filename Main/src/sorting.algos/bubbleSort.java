
package sorting.algos;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {54,5,23,87,5,6,8,98,32,8};
        sort(arr,arr.length-1,0);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void sort(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        else if(r>c){
            if(arr[c]>arr[c+1]){
                swap(arr,c);
            }
            sort(arr,r,++c);
        }
        else {
            sort(arr,r-1,0);
        }
    }
    public static void swap(int[] arr,int c){
        int temp=arr[c];
        arr[c]=arr[c+1];
        arr[c+1]=temp;
    }
}
