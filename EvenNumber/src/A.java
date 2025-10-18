import java.util.*;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		
		List<Integer> l=Arrays.asList(2,4,6,3,8,0 ,2,4,6);
		List<Integer> newData = l.stream().distinct().collect(Collectors.toList());
		System.out.println(newData.size());
		System.out.println(newData);
	}

}
