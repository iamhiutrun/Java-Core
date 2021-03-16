import java.util.ArrayList;
import java.util.Collections;

public class collection {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(36);
		list.add(20);
		list.add(102);
		list.add(109);
		list.add(5);
		Collections.sort(list);
		for(Integer x:list) {
			System.out.println(x);
		}
	}
}
