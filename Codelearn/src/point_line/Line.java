package point_line;

public class Line {
	private Point begin;
	private Point end;
	
	public Line(Point begin, Point end) {
		super();
		this.begin = begin;
		this.end = end;
	}
	
	public Line(int x1, int y1, int x2, int y2)
	{
		this.begin = new Point(x1,y1);
		this.begin = new Point(x2,y2);
	}

	public Point getBegin() {
		return begin;
	}

	public void setBegin(Point begin) {
		this.begin = begin;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public double getLength()
	{
		return Math.sqrt(Math.pow(begin.getX() - end.getX(), Math.pow(begin.getY() - end.getY() ))
	}
}
