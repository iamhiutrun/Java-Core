import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDateTime timeBefore = LocalDateTime.now();
		DateTimeFormatter method = DateTimeFormatter.ofPattern("w");
		String timeAfter = timeBefore.format(method);
		System.out.println(timeAfter);
	}
}
