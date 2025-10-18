
public class A implements Runnable{
	
	public static void main(String[] args) {
		
		System.out.println(10);
		
		A a= new A();
		Thread th= new Thread(a);
		th.setDaemon(true);
		th.start();
		
		System.out.println(Thread.currentThread().getName());
		
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(100);
		
	}

}
