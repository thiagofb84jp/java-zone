package date;

import java.util.Calendar;
import java.util.TimeZone;

public class Exercise05 {
    /**
     * 5. Write a Java program to get the current time in New York.
     */
    public static void main(String[] args) {
        //Create a default calendar
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));

        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
                + calNewYork.get(Calendar.MINUTE)
                + ":" + calNewYork.get(Calendar.SECOND));
    }
}
