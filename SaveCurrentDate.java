import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SaveCurrentDate {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format the date (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = currentDate.format(formatter);

        // Print or save the formatted date
        System.out.println("Current Date: " + formattedDate);

        // You can save this to a file or database as needed
    }
}
