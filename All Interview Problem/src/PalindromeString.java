 

import java.util.*;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(7,5,9,6,8,7);
		
//		ArrayList<Integer> newList= new ArrayList<>();
//		 
//		Set<Integer> set= new HashSet<>();
//		
//		Consumer<Integer> printLists =(n) -> System.out.println(n);
		
//		list.forEach(i -> System.out.println(i));
//		
//	long s=list.stream().count();
//	System.out.println(s);
//	
//		
//		list.stream().reduce(Integer ::max);
	Integer collect =  list.parallelStream().reduce(Integer.MAX_VALUE,(a,b)->(Math.max(a, b)));
	System.out.println(collect);
		
	}

}
