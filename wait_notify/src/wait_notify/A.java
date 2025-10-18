package wait_notify;

public class A extends Thread{
	String name;


	A(String name)
	{
		this.name= name;
	}
	public static void main(String[] args) {
		A a1= new A("xxxx");
		A a2= new A("zzzz");
		a2.setPriority(1);
		a1.setPriority(10);
		System.out.println(a1.getPriority());
		System.out.println(a2.getPriority());
		System.out.println(a1.getName());
		a1.setName("brajesh");
		System.out.println(a1.getName());
		a1.start();
		a2.start();
	}

}
