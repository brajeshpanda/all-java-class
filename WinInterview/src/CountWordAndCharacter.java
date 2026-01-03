import java.util.Arrays;
import java.util.stream.Collectors;

public class CountWordAndCharacter {
	
		
		public static void main(String[] args) {
			String s="If components fail, it is the responsibility of the utility provider to replace them and make the "
					+ "data available using replicas in the meantim Another important reason to build new services based on utility "
					+ "computing is that service providers only pay for what they getNo investments are needed upfront"
					+ " and the cost grows linearly and predictably with the usage ";

			
			String[] x=s.split(" ");

            Long countWord = Arrays.stream(x).collect(Collectors.counting());

            System.out.println("Count word from sentence is :"+countWord);

            String[] y=s.split("");

            Long countCharacter = Arrays.stream(y).collect(Collectors.counting());

            System.out.println("Count Character from sentence is :"+countCharacter);
	}

	}



