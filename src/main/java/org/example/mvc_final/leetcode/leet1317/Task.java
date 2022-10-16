package org.example.mvc_final.leetcode.leet1317;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int n =11;
        getNoZeroIntegers(n);
    }



    public static int[] getNoZeroIntegers(int n) {
        int [] array = new int[2];
        int k=1;

        while (true) {
            array[0] = n - k;
            array[1] = n - array[0];
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            if((array[0]!=0)&&(array[1]!=0)&&(!String.valueOf(array[0]).contains("0"))&&(!String.valueOf(array[1]).contains("0")))break;
            else k++;
        }
    return array;
    }
}
