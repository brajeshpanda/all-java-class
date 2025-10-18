
public class Outer {
	class Inner
	{
		public void m1()
		{
		  System.out.println("inner class method");	
		}
	}
	public void m2()
	{
		Inner i=new Inner();
		System.out.println("bp");
		i.m1();
		
	}
	public static void main(String[] args) {
		
		Outer o= new Outer();
		o.m2();
		System.out.println("outer");
		
		
	}

}
