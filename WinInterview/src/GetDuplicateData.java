
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class GetDuplicateData {
	

	
	public static void main(String[] args) {

//	Output: Chennai , Delhi
	
	List<String> l= Arrays.asList("Chennai", "Mumbai", "Delhi", "Chennai", "Bangalore", "Delhi");
	HashSet<String> s= new HashSet<>();

	   List<String> newData=l.stream().filter(n ->!s.add(n)).collect(Collectors.toList());
	   System.out.println(newData);


       String s1= "Brajesh";
       String s2= "Rajesh";
        String concat = s1.concat(s2);
        String data= s1 + s2;
        System.out.println(data);
        System.out.println(concat);


    }
		
		
	}

