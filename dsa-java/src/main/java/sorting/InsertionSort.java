package main.java.sorting;

class InsertionSort {
    public static void main(String[] args){
        int[] a = {9,3,5,1,2,9,8};
        int n = a.length;
        for(int i = 1;i<n;i++){
            int val = a[i];
            int j = i-1;
            while(j>=0 && a[j]>val){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = val;
        }
        System.out.println(java.util.Arrays.toString(a));
    }
}