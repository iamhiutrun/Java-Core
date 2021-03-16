package Class_Object;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person = new Person[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Value: ");
		
		for(int i=0;i<person.length;i++) {
			String name = sc.nextLine();
			String address = sc.nextLine();
			int age = sc.nextInt();
			person[i] = new Person(name,address,age);
			sc.nextLine();
		}
		sc.close();
		for(Person ps: person) {
			System.out.println(ps.getName()+ " "+ ps.getAddress()+ " "+ ps.getAge());
		}
	}

}
