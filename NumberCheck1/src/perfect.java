
import java.util.Scanner;
public class perfect
{
	public static void main(String[] args) {
		
		int n,sum=0;
		System.out.println("enter the no");
		Scanner scn= new Scanner(System.in);
		n=scn.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				
			}
		}
		if(n==sum)
		{
			System.out.println("perfect no");
		}
		else
		{
			System.out.println("not a perfect no");
		}
	}
}