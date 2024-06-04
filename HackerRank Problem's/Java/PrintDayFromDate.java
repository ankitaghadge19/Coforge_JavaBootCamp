import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

class Result {

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance set to the current date and time
        Calendar calendar = Calendar.getInstance();
        
        // Set the calendar to the specified date (month is 0-based in Calendar)
        calendar.set(year, month-1, day);
        
        // Format the date object to get the day of the week as a full name in English
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(calendar.getTime());
         // Note: For Month - "MMMM"
       
        // Convert the day of the week to uppercase and return it
        return dayOfWeek.toUpperCase();  
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

// Problem Link: https://www.hackerrank.com/challenges/java-date-and-time/problem