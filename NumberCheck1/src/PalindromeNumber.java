import java.util.*;   
class PalindromeNumber
{  
   public static void main(String args[])  
   {  
      String s, reverse = ""; // Objects of String class  
      Scanner in = new Scanner(System.in);   
      System.out.println("Enter a string/number to check if it is a palindrome");  
      s = in.nextLine();   
        
      for ( int i = s.length() - 1; i >= 0; i-- )  
         reverse = reverse + s.charAt(i);  
      if (s.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isn't a palindrome.");   
   }  
}  