import java.util.*;

public class FibonacciNumber {
	public static void main(String[] args) {
		
   int n,first_no=0,second_no=1;
   Scanner scn= new Scanner(System.in);
   System.out.println("Enter a no");
   n=scn.nextInt();
   for(int i=0;i<=n;i++)
   {
	  int next_no=first_no+second_no;
	  first_no=second_no;
	  second_no=next_no;
	  System.out.print(first_no+",");
   }
   
   
}
}
