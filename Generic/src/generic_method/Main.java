package generic_method;

public class Main {

	public static void main(String[] args) {
			int x =5;
			String y = "Porn";
			genericTest test = new genericTest();
			//test.showResult(x,y);

			Integer[] arr = {5,8,0,9,15,-56};
			//System.out.println(test.FindMax(arr));
			
			String a = "hieu";
			int c = 5;
			test.inketqua(c);
	}

}


class genericTest
{
	public <T,V> void showResult(T x, V y)
	{
		System.out.println(x+":"+y);
	}
	
	public <T extends Comparable<T>> T FindMax(T[] arr)
	{
		T max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].compareTo(max)>0)
				max = arr[i];
		}
		return max;
	}
	
	public <T> void inketqua(T x)
	{
		System.out.println(x);
	}
}