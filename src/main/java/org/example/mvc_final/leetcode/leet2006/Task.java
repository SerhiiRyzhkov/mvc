package org.example.mvc_final.leetcode.leet2006;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 4};
        int k = 2;
        System.out.println(countKDifference(nums, k));
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                if (nums[j] - nums[i] > k) break;
                if (nums[i] - nums[j] == k) count++;
                if (nums[j] - nums[i] == k) count++;
            }
        }

        return count / 2;

    }
}
