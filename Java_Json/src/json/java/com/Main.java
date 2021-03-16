package json.java.com;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class Main {

	private final static String FILE_URL = "C:/Users/luong/Downloads/data.txt";

	   public static void main(String[] args) throws IOException {
		   File file = new File(FILE_URL);
	       InputStream inputStream = new FileInputStream(file);
	       InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
	       BufferedReader reader = new BufferedReader(inputStreamReader);
	       ArrayList<Question> list = new ArrayList<>();
	       Scanner sc = new Scanner(System.in);
	       while(true){
	    	   Question question = new Question();
				question.question = reader.readLine();
				question.A = reader.readLine();
				question.B = reader.readLine();
				question.C = reader.readLine();
				question.D = reader.readLine();
				if(question.D == null) break;
				list.add(question);
	       }
	       Gson json = new Gson();
			String response = json.toJson(list);
			System.out.println(response);
	   }

}
