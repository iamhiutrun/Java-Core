
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String input ="";
		String patternStr = "[0-9]{2}[a-z B-Z]{1}[1-9]?";
		while(true)
		{
			System.out.println("Nhap chuoi: ");
			input = sc.next();
			
			Pattern pattern = Pattern.compile(patternStr);
			Matcher matcher = pattern.matcher(input);
			
			if(matcher.find())
			{
				break;
			}
			else System.err.println("Nhap lai: ");
		}
	}

}
