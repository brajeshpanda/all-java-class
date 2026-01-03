

import java.time.*;
import java.time.LocalDateTime;

public class DateTime {
	public static void main(String[] args) {
		
		LocalDateTime d= LocalDateTime.now();
		System.out.println(d);

		Instant i= Instant.now();
		System.out.println(i);
		
		LocalDate date=LocalDate.of(1997,10 , 25);
		
		System.out.println(date.getDayOfWeek());
	}

}
