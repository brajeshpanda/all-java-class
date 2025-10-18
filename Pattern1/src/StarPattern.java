import java.util.*;


public class StarPattern {
	
	public static void main(String[] args) {
		int n;
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the no");
		n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
