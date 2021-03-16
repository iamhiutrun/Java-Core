import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of students: ");
		int n = sc.nextInt();
		Student[] student = new Student[n];
		for(int i=0;i<n;i++) {
			student[i] = new Student();
			student[i].inputStudent();
		}
		sc.close();
		System.out.println("\n\n\t\tINFORMATION");
		for(int i=0;i<n;i++) {
			System.out.println("\n\n\t\tSTUDENT "+(i+1));
			student[i].outputStudent();
			System.out.println("\n\n");
		}
	}

}
