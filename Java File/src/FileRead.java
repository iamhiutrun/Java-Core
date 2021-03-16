import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader file = new FileReader("filenew.txt");
			Scanner myReader = new Scanner(file);
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				int  x = myReader.nextInt();
				System.out.println(data + "  " + x);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Have some errors");
			e.getStackTrace();
		}
	}

}
