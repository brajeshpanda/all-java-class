package project_demo_2;

public class A
{
	int x=10;
	public static void main(String[] args) {
		
		
		try {
			Integer.parseInt("mike15648956165156");
			A a1= null;
			System.out.println(a1.x);
			int x=10/0;
			
		} catch (ArithmeticException e) {
			System.out.println(1);
		}
		catch (NullPointerException e) {
			System.out.println(2);
		}
		catch (Exception e) {
			System.out.println(3);
		}
	}
}