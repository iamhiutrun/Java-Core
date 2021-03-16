package interface_codelearn;

public class Circle implements IShape {
	private double radius;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 3.14*2*radius;
	}

}
