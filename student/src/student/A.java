package student;

public class A {
	
	public void fun(Integer i)
	{
		System.out.println("integer");
	}
	
	public void fun(String s)
	{
		System.out.println("string name");
	}
	
	
	public static void main(String[] args) {
		
		
		A a= new A();
		a.fun((Integer)null);
		
	}

}
