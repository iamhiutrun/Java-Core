import java.util.HashMap;

public class HasMappractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> student = new HashMap<>();
		
		//Add keys and values in student
		student.put("Luong Trung Hieu", 18);
		student.put("Luong Trung Kinh", 10);
		student.put("Mai Trung Giang", 25);
		student.put("Vu Trong Phu", 12);
		//student.remove("Vu Trong Phu");
		//student.clear();
		System.out.println(student);
		System.out.println(student.get("Luong Trung Hieu"));
		//Print Keys
		for(String i:student.keySet()) {
			System.out.println(i);
		}
		//Print Values
		for(Integer i:student.values()) {
			System.out.println(i);
		}
		
		for(String i:student.keySet()) {
			System.out.println("Key: "+i +"\t"+"Value: "+ student.get(i));
		}
	}

}
