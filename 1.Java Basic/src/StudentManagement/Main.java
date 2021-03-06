package StudentManagement;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of student: ");
		int n = sc.nextInt();
		STUDENT[] Student = new STUDENT[n];
		MENU(sc,Student, n);
	}
	public static void MENU(Scanner sc,STUDENT[] Student, int n) {
	
		while(true) {
			System.out.println("\n\n\t\t======= MENU=======");
			System.out.println("1. Initialize Student Array");
			System.out.println("2. Add Student");
			System.out.println("3. Edit Student by ID");
			System.out.println("4. Delete Student by GPA");
			System.out.println("5. Sort Student by Name");
			System.out.println("6. Show Student");
			System.out.println("0. Exit");
			System.out.print("Your choice: ");
			int choice = sc.nextInt();
				switch(choice) {
				case 1: {
					System.out.println("\n\n\t\t=====Initialize Student Array=====");
					for(int i=0;i<n;i++) {
						 System.out.println("Input STUDENT "+(i+1));
						 sc.nextLine();
						 System.out.print("StudentID: ");
						 	String StudentID = sc.nextLine();
						 System.out.print("Name: ");
						 	String name = sc.nextLine();
						 System.out.print("Address: ");
						 	String Address = sc.nextLine();
						 System.out.print("Age: ");
						 	int age = sc.nextInt();
						 System.out.print("GPA: ");
						 	double GPA = sc.nextDouble();
						 Student[i] = new STUDENT( StudentID,  name,  Address,  age,  GPA);
					}
					break;
				}
				case 2:{
					
					break;
				}
				
				case 3:{
					break;
				}
				case 4:{
					break;
				}
				case 5:{
					break;
				}
				case 6:{
				
					for(int i=0;i<n;i++) {
						System.out.println("Information STUDENT "+(i+1));
					System.out.println(Student[i].getStudentID());
					System.out.println(Student[i].getName());
					System.out.println(Student[i].getAddress());
					System.out.println(Student[i].getAge());
					System.out.println(Student[i].getGPA());
					sc.nextLine();
					}
					break;
				}
				
				case 0: System.exit(0);
				
				default:{
					System.out.println("Error, Please choose again.");
				}
			}
		}
	}
	
}
