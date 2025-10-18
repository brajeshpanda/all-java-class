

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReversalStream {
	
	public static void main(String[] args) {
		
		String s="i love my india";
		
		String data = Stream.of(s.split("")).reduce("",(a,b)->b+a);
		System.out.println(data);


	}
		
	

}




