import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class TextFileFactory {
	public static boolean luufile(ArrayList<String>dsData, String path) {
		boolean ok = false;
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			for(String data: dsData) {
				bw.write(data);
				bw.newLine();
			}
			return true;
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
}
