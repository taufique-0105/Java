package recursiveProblems.arrays;

public class checkSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,4,74,9};
        boolean result =  isSorted(arr,0);
        System.out.println(" Is Sorted " + result);
    }
    public static boolean isSorted(int[] arr,int n) {
        if(n == arr.length-1){
            return true;
        }
        return arr[n] < arr[n+1] && isSorted(arr,++n);
    }
}