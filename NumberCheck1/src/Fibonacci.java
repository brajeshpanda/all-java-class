import java.util.Scanner;
public class Fibonacci {
	 
		  public static void main(String[] args) {

		    int i = 1 ,n , first_no =0, second_no=1 ;
		    Scanner scn= new Scanner(System.in);
		    System.out.println("enter the no");
		    n= scn.nextInt();

		    	    for ( i= 1; i <= n; i++) {
		    	    	 
		    	      // compute the next term
		    	      int next_no = first_no + second_no;
		    	     first_no= second_no;
		    	      second_no= next_no;
		    	      System.out.print(first_no + ", ");

		    	    }
		    	  }
		   
		  }
		


