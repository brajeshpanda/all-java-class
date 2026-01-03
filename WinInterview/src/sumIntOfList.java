 

import java.util.*;
import java.util.List;

public class sumIntOfList {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(7,5,9,9,7,5,6,8,7);
		

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }

}
