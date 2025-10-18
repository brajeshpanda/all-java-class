import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		int n,fact=1;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a no");
		n=scn.nextInt();
	     
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial :"+fact);
	}
	

}
