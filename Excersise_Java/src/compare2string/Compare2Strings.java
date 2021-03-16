package compare2string;

public class Compare2Strings {
	public static void main(String[] args) {
		String a= "abcd";
		String b = "abdc";
		
		
		
		System.out.println(compareRandom(a, b));
	}
	
	public static boolean compareRandom(String a, String b) {
		if(a.length()!=b.length()) return false;
		else {
			String temp = "";
			for(int i=0;i<a.length();i++)
			{
				for(int j=i+1;j<a.length();j++)
				{
					temp = a.substring(0,i)+a.substring(j,j+1)+a.substring(i+1, j)+a.substring(i,i+1)+a.substring(j+1,a.length());
					if(temp.equals(b)) return true;
				}
			}
		}
		return false;
	}
}
