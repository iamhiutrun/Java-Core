package point_triangle;

public class Triangle {
	private Point vertice1;
	private Point vertice2;
	private Point vertice3;
	
	public Triangle(Point vertice1, Point vertice2, Point vertice3) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.vertice3 = vertice3;
	}
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		this.vertice1 = new Point(x1,y1);
		this.vertice2 = new Point(x2,y2);
		this.vertice3 = new Point(x3,y3);
	}
	public Point getVertice1() {
		return vertice1;
	}
	public void setVertice1(Point vertice1) {
		this.vertice1 = vertice1;
	}
	public Point getVertice2() {
		return vertice2;
	}
	public void setVertice2(Point vertice2) {
		this.vertice2 = vertice2;
	}
	public Point getVertice3() {
		return vertice3;
	}
	public void setVertice3(Point vertice3) {
		this.vertice3 = vertice3;
	}
	
	public double getPerimeter() 
	{
		double AB = Math.sqrt(Math.pow(vertice2.getX() - vertice1.getX(),2) + Math.pow(vertice2.getY() - vertice1.getY(),2));
		double AC = Math.sqrt(Math.pow(vertice3.getX() - vertice1.getX(),2)+ Math.pow(vertice3.getY() - vertice1.getY(),2));
		double BC = Math.sqrt(Math.pow(vertice3.getX() - vertice2.getX(),2)+ Math.pow(vertice3.getY() - vertice2.getY(),2));
		
		return AB+AC+BC;
	}
	
}
