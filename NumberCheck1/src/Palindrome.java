
 class Palindrome{  
 public static void main(String args[]){  
  int rem,rev=0,temp;    
  int n=454;//It is the number variable to be checked for palindrome  
  
  temp=n;    
  while(n>0){    
   rem=n%10;  //getting remainder  
   rev=(rev*10)+rem;    
   n=n/10;    
  }    
  if(temp==rev)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  
