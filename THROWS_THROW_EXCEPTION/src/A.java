
import java.util.Scanner;

public class A {
public static void main(String[] args) {
	
int balance =500;
Scanner sc= new Scanner(System.in);
System.out.println("please enter amount");
int amount=sc.nextInt();
if(balance>amount)
{
	System.out.println("please collect the cash");
}
    else
     {
         try
        {
         throw new InsufficientFunds();
        }
       catch(InsufficientFunds e)
        {
	    System.out.println(e);
	    System.out.println("low balance ! !");
        }
     }
   }
}