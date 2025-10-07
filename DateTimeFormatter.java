import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter24h = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formatted24h = now.format(formatter24h);
        System.out.println("24-hour format with milliseconds: " + formatted24h);

        DateTimeFormatter formatter12h = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss.SSS a");
        String formatted12h = now.format(formatter12h);
        System.out.println("12-hour format with milliseconds: " + formatted12h);
        
    }
}
