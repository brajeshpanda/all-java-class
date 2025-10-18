import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n;
		int temp=0;
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the no");
		n=scn.nextInt();
		
		for(int i=2;i<n-1;i++)
		{
			if(n % i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("it is  a prime no");
		}
		else
		{
			System.out.println("it is  not a prime no");
		}
	}

}
