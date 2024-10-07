package searching.algos;

import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,7,9};
        int s = 7;
        System.out.println(search(arr,s,0));
        System.out.println(indexSearch(arr,s,0));
        System.out.println(indexSearchLast(arr,s,arr.length-1));
        System.out.println(searchAll(arr,s,0,new ArrayList<>()));
        System.out.println(searchAll2(arr,s,0));
    }
    public static boolean search(int[] arr,int s,int n){
        if(n == arr.length){
            return false;
        }
        return arr[n] == s || search(arr,s,++n);
    }
    public static int indexSearch(int[] arr,int s,int n){
        if(n == arr.length){
            return -1;
        }
        else if(arr[n] == s){
            return n;
        }
        else {
            return indexSearch(arr,s,++n);
        }
    }
    public static int indexSearchLast(int[] arr,int s,int n){
        if(n == -1){
            return -1;
        }
        else if(arr[n] == s){
            return n;
        }
        else {
            return indexSearchLast(arr,s,--n);
        }
    }
    public static ArrayList<Integer> searchAll(int[] arr, int s, int n, ArrayList<Integer> list){
        if(n == arr.length){
            return list;
        }
        else if(arr[n] == s){
            list.add(n);
        }
        return searchAll(arr,s,++n,list);
    }
    public static ArrayList<Integer> searchAll2(int[] arr,int s, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (n == arr.length) {
            return list;
        } else if (arr[n] == s) {
            list.add(n);
        }
        ArrayList<Integer> list2 = searchAll2(arr, s, ++n);
        list.addAll(list2);
        return list;
    }
}
