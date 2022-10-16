package org.example.mvc_final.leetcode;

import java.util.ArrayList;

public class Task {
    public static void main(String[] args)
    {
        Integer[] test = new Integer[3];
        test[0] = 2;
        test[1] = 3;
        test[2] = 4;
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        arrayList.add(test);
        for(int i = 0; i < arrayList.size();i++)
        {
            for(int j = 0; j < arrayList.get(i).length; j++)
            {
                System.out.println(arrayList.get(i)[j]);
            }
        }
    }
}
