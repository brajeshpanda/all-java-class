import java.util.Arrays;

public class CountWord {
	
		
		public static void main(String[] args) {
			String s="If components fail, it is the responsibility of the utility provider to replace them and make the "
					+ "data available using replicas in the meantim Another important reason to build new services based on utility "
					+ "computing is that service providers only pay for what they getNo investments are needed upfront"
					+ " and the cost grows linearly and predictably with the usage ";
//			int count=1;
//			for(int i=0;i<s.length()-1;i++)
//			{
//				if((s.charAt(i)==' ')&&( s.charAt(i+1)!=' '))
//	           {
//		            count++;
//		
//	           }
//			}
//		
//		System.out.println("Number of words in this paragraph:"+count);
			
			String[] x=s.split("\\s+");
//			
			long count = Arrays.stream(x).count();
			
			System.out.println(count);
	}

	}



