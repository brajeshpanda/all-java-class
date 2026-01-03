

import java.util.stream.Stream;

public class StringReversalStream {
	
	public static void main(String[] args) {
		
		String s="i love my india";

        String s1 = Stream.of(s.split("")).reduce("",(a, b) -> b +""+ a);
        System.out.println(s1);


	}
		
	

}




