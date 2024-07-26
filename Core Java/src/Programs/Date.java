import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalTime time = LocalTime.now();
        System.out.println("Current time in (hh:mm:ss.SSS): " + time);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date & time: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss yyyy-MM-dd");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted date & time: " + formattedDateTime);

        ZonedDateTime localZonedDateTime = ZonedDateTime.now();
        System.out.println("Current time & date with zone: " + localZonedDateTime);

        ZonedDateTime newYorkZonedDateTime = localZonedDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Current time & date with zone of New York: " + newYorkZonedDateTime);

        String formattedNewYorkDateTime = newYorkZonedDateTime.format(formatter);
        System.out.println("Formatted New York date & time: " + formattedNewYorkDateTime);
    }
}
