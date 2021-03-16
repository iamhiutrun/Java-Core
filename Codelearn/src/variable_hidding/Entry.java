package variable_hidding;

class Entry
{
	public static void main(String[] args) {
		SuperClass a = new SubClass();
		System.out.println(a.x);
		System.out.println(((SubClass)a).x);
	}
}

