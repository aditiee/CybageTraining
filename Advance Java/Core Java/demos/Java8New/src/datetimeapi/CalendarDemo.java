package datetimeapi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class CalendarDemo {
public static void main(String[] args) {
	//JAVA 7
	Calendar c=Calendar.getInstance();
	
	c.set(2018, 1, 2);
	System.out.println(c.getTime());
	c.add(Calendar.DAY_OF_MONTH, 7);
	
	System.out.println(c.getTime());
	/**LocalDate***/
	//Date  mydate=new Date();
	
	
	LocalDate localDate = LocalDate.now();
	System.out.println(localDate);
	localDate=LocalDate.of(2015, 02, 20);
	System.out.println(localDate);
	localDate=LocalDate.parse("2015-02-20");
	System.out.println(localDate);
	LocalDate tomorrow = LocalDate.now().plusDays(1);
	System.out.println(tomorrow);
	LocalDate previousMonthSameDay = LocalDate.now().minusMonths(1);//(1, ChronoUnit.MONTHS);
	
	DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
	 
	int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
	
		/**LocalTime***/
	
	LocalTime cal=LocalTime.now();
	System.out.println(cal);
	cal.plusHours(3);
	System.out.println(cal);
	
	System.out.println(ZonedDateTime.now());
	System.out.println(LocalDate.of(2014,Month.FEBRUARY, 15));
	
	
	
	
}
}
