package sorting.algos;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {98,45,74,5,1,87};
        int[] sorted = sort(arr);
        for(int i: sorted){
            System.out.print(i+" ");
        }
    }
    public static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = sort(Arrays.copyOfRange(arr,0,mid));
        int[] second = sort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(first, second);
    }
    static int[] merge(int[] first, int[] second){
        int[] mix= new int[first.length + second.length];

        int i=0, j=0, k=0;
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k] = first[i];
            k++;
            i++;
        }
        while(j<second.length){
            mix[k] = second[j];
            k++;
            j++;
        }
        return mix;
    }
}
