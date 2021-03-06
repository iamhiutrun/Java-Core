
//
//import java.util.ArrayList;
//import java.util.Scanner;
//import com.google.gson.Gson;
//
//public class JsonQuestion {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<Vocab> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<1;i++)
//		{
//			System.out.println(i);;
//			Vocab vocab = new Vocab();
//			
//			vocab.word = sc.nextLine();
//			vocab.phonetics = sc.nextLine();
//			vocab.meaning = sc.nextLine();
//			vocab.example = sc.nextLine();
//			vocab.exampleMeaning = sc.nextLine();
//			list.add(vocab);
//		}
//		
//		Gson json = new Gson();
//		String response = json.toJson(list);
//		System.out.println(response);
//	}
//
//}

package json.java.com;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;

public class JsonQuestion {

   private final static String FILE_URL = "C:/Users/luong/Downloads/data.txt";

   public static void main(String[] args) throws IOException {
	   File file = new File(FILE_URL);
       InputStream inputStream = new FileInputStream(file);
       InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
       BufferedReader reader = new BufferedReader(inputStreamReader);
       ArrayList<Vocab> list = new ArrayList<>();
       Scanner sc = new Scanner(System.in);
       while(true){
    	   Vocab vocab = new Vocab();
			vocab.word = reader.readLine();
			vocab.phonetics = reader.readLine();
			vocab.explain = reader.readLine();
			vocab.meaning = reader.readLine();
			vocab.example = reader.readLine();
			vocab.exampleMeaning = reader.readLine();
			if(vocab.exampleMeaning == null) break;
			list.add(vocab);
       }
       Gson json = new Gson();
		String response = json.toJson(list);
		System.out.println(response);
   }
}