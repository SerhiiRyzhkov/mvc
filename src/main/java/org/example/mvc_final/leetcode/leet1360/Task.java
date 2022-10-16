package org.example.mvc_final.leetcode.leet1360;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task {
    public static void main(String[] args) {
        String date1= "2020-01-15";
        String date2= "2019-12-31";
        System.out.println(daysBetweenDates(date1,date2));
    }
    public static int daysBetweenDates(String date1, String date2) {

        String [] dat1 = date1.split("-");
        String [] dat2 = date2.split("-");


        Calendar calendar1 = new GregorianCalendar(Integer.valueOf(dat1[0]),Integer.valueOf(dat1[1])-1,Integer.valueOf(dat1[2]));

        Calendar calendar2 = new GregorianCalendar(Integer.valueOf(dat2[0]),Integer.valueOf(dat2[1])-1,Integer.valueOf(dat2[2]));

        int result = (int)((calendar1.getTimeInMillis()-calendar2.getTimeInMillis())/(3600000*24));

    return Math.max(result,result*-1);
    }
}
