
public class SharedData {
	public int x = 0;
	public int rad = 0;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getRad() {
		return rad;
	}

	public void setRad(int rad) {
		this.rad = rad;
	}

	public synchronized void add(int plus)
	{
		x += plus;
		System.out.println("\nday so x = "+x);
		for(int i=0;i<x;i++)
		{
			System.out.print(" " +i);
		}
	}
}
