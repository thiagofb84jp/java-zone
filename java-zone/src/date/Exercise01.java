package date;

import java.util.Calendar;

public class Exercise01 {
    /**
     * 1. Write a Java program to create a Date object using the Calendar class.
     */
    public static void main(String[] args) {
        int year = 2023;
        int month = 9;
        int date = 30;

        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
    }
}
