package fr.diginamic.dates;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println("date 1");
        System.out.println(dateFormat1.format(date));
        Date date2= new Date(2020, Calendar.MAY,19,23,59,30);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        System.out.println("date 2:");
        System.out.println(dateFormat.format(date2));
        Date date3 = new Date(System.currentTimeMillis());
        System.out.println("date 3:");

        System.out.println(dateFormat.format(date3));
    }
}
