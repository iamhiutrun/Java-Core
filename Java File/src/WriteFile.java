import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter file = new FileWriter("filenew.txt");
			file.write("Write file successfully");
			file.write("^.^");
			System.out.println("Successfully");
			file.close();
		} catch (IOException e) {
			System.out.println("Have some errors");
			e.getStackTrace();
		}
	}

}
