
import java.util.Scanner;

public class PtBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		if(a==0) {
			if(b==0&&c!=0) System.out.println("Phuong Trinh vo nghiem.");
			else if(b==0&&c==0) System.out.println("Phuong trinh co vo so nghiem.");
			else {
				double x = (double)1.0*-c/b;
				System.out.println("Phuong Trinh co nghiem x = " + x);
			}
		}	
		
		else {
			double denta = b*b - 4*a*c;
			if (denta<0) System.out.println("Phuong Trinh vo nghiem.");
			else if (denta == 0) {
				double x = (double)-b/(2*a);
				System.out.println("Phuong Trinh co nghiem kep x1 = x2 = "+x);
			}
			if(denta>0) {
				double x1 = (double)(-b + Math.sqrt(denta))/(4*a);
				double x2 = (double)(-b - Math.sqrt(denta))/(4*a);
				System.out.println("Phuong Trinh co 2 nghiem: ");
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
		}
		
	}

}
