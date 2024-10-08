package sorting.algos;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {98,45,74,5,1,87};
        sort(arr,0, arr.length);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
    static void sort(int[] arr, int start,int end){
        if(end-start == 1){
            return;
        }
        int mid = (start+end)/2;
        sort(arr,start,mid);
        sort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    static void merge(int[] arr, int start, int mid, int end){
        int[] mix = new int[end-start];
        int i = start;
        int j = mid;
        int k = 0;
        while(i<mid && j<end){
            mix[k++] = arr[i]<arr[j] ? arr[i++] : arr[j++];
        }
        while(i<mid){
            mix[k++] = arr[i++];
        }
        while(j<end){
            mix[k++] = arr[j++];
        }
        System.arraycopy(mix, 0, arr, start, mix.length);
    }
}
