package com.july.sorting;

class Test2 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 2;

        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }
}