import java.util.Arrays;
import java.util.*;

public class LargestNumber {
	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(1,2,3,4,5,6,1,2,3,5,34,21,3);
		
		Integer LargeNo = l.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().orElse(null);
		System.out.println(LargeNo);

		
	}
	
	
}
