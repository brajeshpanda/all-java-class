
import java.util.*;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class GetDuplicateData {
	

	
	public static void main(String[] args) {
	
//	List<String> placeList = Arrays.asList("Chennai", "Mumbai", "Delhi", "Chennai", "Bangalore", "Delhi");
		
//	Output: Chennai , Delhi
	
	List<String> l= Arrays.asList("Chennai", "Mumbai", "Delhi", "Chennai", "Bangalore", "Delhi");
	HashSet<String> s= new HashSet<>();
	
	   List<String> newData=l.stream().filter(n ->!s.add(n)).collect(Collectors.toList());
	   System.out.println(newData);


    }	
		
		
	}

