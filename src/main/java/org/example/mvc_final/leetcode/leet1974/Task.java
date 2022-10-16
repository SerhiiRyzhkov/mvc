package org.example.mvc_final.leetcode.leet1974;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String word = "pdy";
        System.out.println(minTimeToType(word));

    }
    public static int minTimeToType(String word) {
        int clock=0;
        char [] array = word.toCharArray();

        char [] alphabet = new char[52];

        int index=0;
        for(int i=0;i<2;i++) {
            char current = 'a';

            while (current != '{') {
            alphabet[index++]=current++;

            }
        }
        System.out.println(Arrays.toString(alphabet));

        index=26;
        for(int i=0;i<array.length;i++){
            int clock1=0;
            int clock2=0;
            int start_index=index;

            while (alphabet[index]!=array[i]){
                index--;
                clock1++;
                System.out.println("left  clock1"+clock1);
                if(index==0)index=26;
            }
            index=start_index;
            while (alphabet[index]!=array[i]){
                index++;
                clock2++;
                System.out.println("right clock2"+clock2);
                if(index==51)index=25;
            }
            clock+=Math.min(clock1,clock2)+1;
            System.out.println("note CLOCK"+clock);
        }





        return clock;
    }
}
