import java.time.temporal.TemporalAdjusters;
import java.time.*;

class Main {
    public static void main(String args[]){
        int year=2024;
        findLastFridayOfEveryMonth(year);
    }

    public static void findLastFridayOfEveryMonth(int year){

        for(int month = 1; month<=12;month++){
            YearMonth ym= YearMonth.of(year,month);
            LocalDate lastDayOfMonth = ym.atEndOfMonth();  // last day of the month
            LocalDate firstDayOfMonth = ym.atDay(1); // first day of the month
            LocalDate lastFriday = lastDayOfMonth.with(TemporalAdjusters.
                                                        previousOrSame(DayOfWeek.FRIDAY));  // either last day if it is friday or very previous friday
             LocalDate firstFriday = firstDayOfMonth.with(TemporalAdjusters.
                                                        nextOrSame(DayOfWeek.FRIDAY));  // either first day if it is friday on very next friday 
            System.out.println("Last Friday of "+ym.getMonth()+" is "+lastFriday);
            System.out.println("First Friday of "+ym.getMonth()+" is "+firstFriday);
        }
        
    }
}
