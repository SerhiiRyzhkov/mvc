package org.example.mvc_final.leetcode.leet1544;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        String s = "Pp";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)
            list.add(s.charAt(i));
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 1; i < list.size(); i++) {
                if ((list.get(i) == list.get(i - 1) - 32) || (list.get(i) == list.get(i - 1) + 32)) {
                    list.remove(i);
                    list.remove(i - 1);
                    flag = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++)
            sb.append(list.get(i));

        return sb.toString();
    }
}
