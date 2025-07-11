package com.sealedclass.example;

public class MedianOf2SortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] nums3 = new int[length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            nums3[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums3[k++] = nums2[j++];
        }
        if (length % 2 == 1) {
            return nums3[length / 2];
        } else {
            int midElement = length / 2;
            return (nums3[midElement - 1] + nums3[midElement]);
        }

    }
}