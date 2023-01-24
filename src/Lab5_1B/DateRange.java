package Lab5_1B;

import java.util.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateRange {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public DateRange(LocalDateTime startDate, LocalDateTime endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

//    public boolean isInRange(LocalDateTime date) {
//        return date.compareTo(startDate) >= 0 && date.compareTo(endDate)<=0;
//;    }

    public String toString() {
        return "Starting date is " + startDate + "end date is " + endDate;
    }
    // public static Date getFirstDayOfMonth(Date date){
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));
//        return cal.getTime();
//
//    public static LocalDate getFirstDayOfMonth(LocalDate date){
//        return date.with(TemporalAdjusters.firstDayOfMonth());
//    }
//
////    public static Date getLastDayOfMonth(Date date){
////        Calendar cal = Calendar.getInstance();
////        cal.setTime(date);
////        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
////        return cal.getTime();
//    //}
//    public static LocalDate getLastDayOfMonth(LocalDate date){
//        return date.with(TemporalAdjusters.lastDayOfMonth());
//    }
//
//}
}