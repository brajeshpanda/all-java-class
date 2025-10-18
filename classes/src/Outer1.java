
public class Outer1 {
	class Inner
	{
		public void m1()
		{
			System.out.println("inner class method");
		}
	}

}
class Test
{
	public static void main(String[] args) {
		new Outer().new Inner().m1();
		
	}
}
