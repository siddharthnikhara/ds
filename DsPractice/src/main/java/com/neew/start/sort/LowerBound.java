package com.neew.start.sort;

public class LowerBound {
    public static void main(String[] args) {
        int a[] = {2, 5, 6, 7, 12, 15, 46, 67};
        System.out.println(findLowerBound(a, 0, a.length, 12));
        System.out.println(findUpperBound(a, 0, a.length, 12));
    }


    private static int findLowerBound(int[] a, int low, int high, int no){
        int ans = a.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>=no){
                ans = mid;
                high= mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return ans;
    }

    private static int findUpperBound(int[] a, int low, int high, int no){
        int ans = a.length;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid]>no){
                ans = mid;
                high = mid-1;
            }
            else {
              low = mid+1;
            }
        }
        return ans;
    }
}
