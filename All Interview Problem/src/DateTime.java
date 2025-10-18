

import java.time.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
	public static void main(String[] args) {
		
		LocalDateTime d= LocalDateTime.now();
		System.out.println(d);

//		Instant i= Instant.now();
//		System.out.println(i);
		
		LocalDate date=LocalDate.of(1997,4 , 18);
		
		System.out.println(date.getDayOfWeek());
	}

}
