/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package NextPermutation;

import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }
        if (i == 0) {
            reverse(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length - 1;
        while (nums[j] <= nums[i - 1]) {
            j--;
        }
        // swap
        swap(nums, i - 1, j);
        reverse(nums, i, nums.length - 1);
    }

    private void reverse(int[] nums, int lo, int hi) {
        int i = lo, j = hi;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        if (i == j)
            return;
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}

public class App {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 3, 1};
        System.out.printf("%s => ", Arrays.toString(nums));

        Solution solution = new Solution();
        solution.nextPermutation(nums);
        System.out.printf("%s%n", Arrays.toString(nums));
    }
}
