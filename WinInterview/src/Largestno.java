import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Largestno {
	public static void main(String[] args) {
		
//		int [] a= {12,2,4,5,6,8,10,15};
//		int max=a[0];
//
//		for(int i=0;i<a.length;i++)
//		{
//			if(max<a[i])
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("max no :"+max);

    //MAXIMUM NUMBER
			List<Integer> numbers = Arrays.asList(10, 25, 5, 87, 42, 60);


		//MAXIMUM NUMBER
		Optional<Integer> data = numbers.stream().max(Integer::compareTo);

		System.out.println(data.get());


		//MINIMUM NUMBER

		Optional<Integer> newData = numbers.stream().min(Integer::compareTo);
		System.out.println(newData.get());

		System.out.println("-----------------------------");


		//MAXIMUM NUMBER AND MINIMUM NUMBER
		List<Integer> collect = numbers.stream().sorted().distinct().collect(Collectors.toList());

		System.out.println(collect);

		System.out.println("maximum : "+collect.get(collect.size()-1));
		System.out.println("minimum : "+collect.get(0));


		System.out.println("-------------------------------");

		System.out.println(collect);

		System.out.println("second Maximum : "+collect.get(collect.size()-2));
		System.out.println("second minimum : "+collect.get(1));


	}



}
