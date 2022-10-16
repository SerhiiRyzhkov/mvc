package org.example.mvc_final.leetcode.leet1652;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] code = {2, 4, 9, 3};
        int k = -2;
        decrypt(code, k);

    }

    public static int[] decrypt(int[] code, int k) {
        int[] array = new int[code.length];
        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int temp = k;
                int sum = 0;
                int index = i;
                while (temp != 0) {
                    if (index == code.length - 1) index = -1;
                    sum += code[++index];
                    temp--;
                }
                array[i] = sum;
            }
        } else if (k == 0) {
            return array;
        } else {
            for (int i = code.length - 1; i >= 0; i--) {
                int temp = k;
                int sum = 0;
                int index = i;
                while (temp != 0) {
                    if (index == 0) index = code.length;
                    sum += code[--index];
                    temp++;
                }
                array[i] = sum;
            }
        }


        System.out.println(Arrays.toString(array));
        return array;
    }
}
