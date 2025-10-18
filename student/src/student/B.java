package student;

public class B {
	public static void main(String[] args) {
		
	int max=0;
	
	int[] x= {10,5,3,5,10,15};
	
//	  for(int i=0;i<x.length;i++)
//	  {
//		 if(x[i]>max)
//		 {
//			 max= x[i];
//		 }
//	  }
//	  System.out.println(max);
	
	        for (int i = 0; i < x.length - 1; i++)
	        {
	        	
	        
	            for (int j = i + 1; j < x.length; j++) 
	            {
	            	
	            
	                if (x[i] == x[j] && i != j) 
	                {
	                	
	                
	                    System.out.println("Duplicate value: " + x[i]);
	                }
	            }
	        }
	    }
}
	

	
	
	


