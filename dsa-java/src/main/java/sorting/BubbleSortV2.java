package main.java.sorting;

class BubbleSortV2 {
    public static void main(String[] args){
        int[] a = {9,3,5,1,2,9,8};
        int n = a.length;
        for(int i = 0;i<n;i++){
            boolean swap = false;
            for(int j = 0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    swap  = true;
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
            if(swap == false)
                break;
        }
        System.out.println(java.util.Arrays.toString(a));
    }
}