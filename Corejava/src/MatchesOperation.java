import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
public class MatchesOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String pattern=".*Q[^u]\\d+\\..*";
		String line="Order QT300. Now!";
		if(line.matches(pattern)) {
			System.out.println(line+"matches\""+pattern+"\"");
		}
		else {
			System.out.println("No MATCH");
		}
	}

}*/
		/*LocalDate date = LocalDate.now();
	      System.out.println("Current date: "+date);
	      //Getting the current time value
	      LocalTime time = LocalTime.now();
	      System.out.println("Current time: "+time);
	      //Getting the current date-time value
	      LocalDateTime dateTime = LocalDateTime.now();
	      System.out.println("Current date-time: "+dateTime);*/
		Date date = new Date();
	      String timeFormatString = "hh:mm:ss a";
	      DateFormat timeFormat = new SimpleDateFormat(timeFormatString);
	      String currentTime = timeFormat.format(date);
	      System.out.println("Current time: "+currentTime);
	      String dateFormatString = "EEE, MMM d, ''yy";
	      DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
	      String currentDate = dateFormat.format(date);
	      System.out.println("Current date: "+currentDate);

}
}