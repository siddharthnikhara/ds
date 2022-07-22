package com.example.recursion;

public class TilesPlaceInM_N {
    public static void main(String[] args) {
        System.out.println(placeTiles(4,2));
    }
    static int placeTiles(int m ,int n){
        if (m == n) {
            return 2;
        }
        if(m<n){
            return 1;
        }

        //horizontal
        int horizontal = placeTiles(m-1,n);
        //vertical
        int vertical = placeTiles(m-n,n);
        return horizontal+vertical;
    }
}
