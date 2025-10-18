import java.util.stream.Collectors;
import java.util.*;

public class DuplicateNumber {
	
	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(1,3,2,5,3,2,5,8);
		
		Set<Integer> s= new HashSet<>();
		
		List<Integer> newData = l.stream().filter(n ->!s.add(n)).collect(Collectors.toList());
		System.out.println(newData);
	}

}
