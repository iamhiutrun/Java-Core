package interface_codelearn;

public class Rectangle implements IShape {
	private double length;
	private double width;
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (length + width)*2;
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	
}
