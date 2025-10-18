import java.util.*;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		String s;
		String rev="";
		Scanner scn= new Scanner(System.in);
		
		System.out.println("ENTER A WORD/NUMBER");
		 s=scn.nextLine();
		for(int i=s.length()-1;i>=0;i--)
		
			rev=rev+s.charAt(i);
		
		if(s.equals(rev))
		{
			System.out.println("it is a reverse string/NUMBER");
		}
		else
		{
			System.out.println("it is not a reverse string/NUMBER");
		
		}
		
		}

}
