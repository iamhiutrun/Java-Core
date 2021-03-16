package Class_Object;

public class Rectangle {
	static int  count = 0;
	public static int chuvi(int chieudai, int chieurong) {
		return (chieudai + chieurong)*2;
	}
	public static void main(String[] args) {
		System.out.println(Rectangle.count);
		Rectangle.count+=1;
		System.out.println(Rectangle.count);
	}
}
