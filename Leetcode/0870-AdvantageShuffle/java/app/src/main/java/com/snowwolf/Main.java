/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.snowwolf;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {12, 17, 8, 32};
        int[] nums2 = {18, 25, 32, 11};

        Solution solution = new Solution();
        int[] permutation = solution.advantageCount(nums1, nums2);
        System.out.printf("nums1      : %s\n", Arrays.toString(nums1));
        System.out.printf("nums2      : %s\n", Arrays.toString(nums2));
        System.out.printf("permutation: %s\n", Arrays.toString(permutation));
    }
}