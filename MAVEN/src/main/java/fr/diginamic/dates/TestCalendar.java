package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar= new GregorianCalendar(2016, Calendar.MAY,19,23,59,30);
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(dateFormat.format(calendar.getTime()));
        Calendar date=Calendar.getInstance();
        SimpleDateFormat dateFormat2=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        System.out.println(dateFormat2.format(date.getTime()));
    }
}
