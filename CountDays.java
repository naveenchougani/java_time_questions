import java.time.temporal.*;
import java.time.*;

class Main {
    public static void main(String args[]){

LocalDate start = LocalDate.of(2022, 10, 7);
LocalDate end = LocalDate.of(2025, 10, 7);
long daysBetween = ChronoUnit.DAYS.between(start, end); // returns 1096
long daysInclusive = ChronoUnit.DAYS.between(start,end)+1; // returns 1097
        System.out.println(daysBetween+" - "+daysInclusive);

    }
}
