package com.example.arrayPractice;


public class MoveZeros {
    public static int[] moveZeros(int n, int []a) {
        int j =-1;

        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){return a;}

        for(int i = j+1;i<n;i++){
            if(a[i]!=0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;
    }


    static void moveZeros(int[] arr, int n) {
        int j = 0; // position to place next non-zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap only if i and j are different
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
         moveZeros(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}

