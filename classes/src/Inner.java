
public class Inner 
{
	class Outer
	{
		public void m1()
		{
			System.out.println("inner class method");
		}
	}
	public static void main(String[] args) {
		Inner i=new Inner();
		Inner.Outer o=i.new Outer();
		o.m1();
		 
	}

}
