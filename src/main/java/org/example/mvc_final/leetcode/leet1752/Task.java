package org.example.mvc_final.leetcode.leet1752;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,2};
        System.out.println(check(nums));

    }
    public static boolean check(int[] nums) {
        int border=-1;

        for(int i =1;i<nums.length;i++)

            if(nums[i]<nums[i-1]) {
                border=i;
                break;
            }
        if (border==-1)return true;
        List<Integer> list = new ArrayList<>();
        for(int i=border;i< nums.length;i++)
            list.add(nums[i]);
        for(int i=0;i<border;i++)
            list.add(nums[i]);
        System.out.println(list);
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
            if(list.get(i)!=nums[i])return false;
        return true;
    }
}
