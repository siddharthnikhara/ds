package com.example.searchingAndsorting;

class FloorOfElementInSortedArray {
    private static int findFloorBinarySearch(int[] a, int x) {
        int n = a.length;
        int start = 0;
        int end = n - 1;
        int floor = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == a[mid]) {
                return a[mid];
            } else if (x < a[mid]) {
                end = mid - 1;
            } else {
                floor = a[mid];
                start = mid + 1;
            }
        }
        return floor;
    }

    public static void main(String[] args) {
        int a[] = {3, 5, 6, 7, 12, 15, 46, 67};
        int x = 45;
        System.out.printf("Floor(%d) = %d%n", x, findFloorBinarySearch(a, x));
    }
}