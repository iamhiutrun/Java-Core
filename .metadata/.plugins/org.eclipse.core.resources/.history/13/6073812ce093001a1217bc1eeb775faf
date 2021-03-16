import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("filenew.txt");
			if(file.createNewFile()) {
				System.out.println("Create new file succesfully");
				System.out.println("File named: "+file.getName());
				System.out.println(file.getAbsolutePath());
			}
			else System.out.println("File already exists");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("have some errors");
			e.getStackTrace();
		}
		
	}

}
