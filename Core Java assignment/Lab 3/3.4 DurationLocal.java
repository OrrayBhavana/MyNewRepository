package VJIT;

import java.time.*;
import java.time.temporal.*;

public class DurationLocal {
	 public void localdur()
     {
    	 LocalDate pdate = LocalDate.of(2014,12,11);
	        LocalDate after= LocalDate.of(2016, 03, 18);
	        /*return ChronoUnit.DAYS.between(pdate, after);*/
	        Period dur = Period.between(pdate, after);
	       System.out.printf("\nDuration is %d years, %d months and %d days old\n\n",dur.getYears(), dur.getMonths(), dur.getDays());
}
       public static void main(String[] args)
    {
        DurationLocal d = new DurationLocal();
        d.localdur();
     
     
    }
}
