import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllStreamClass {

    public static void main(String[] args) {






























//        String s1= ("brajesh Kumar Panda");
//
//        String reverse = Stream.of(s1.split("")).reduce(" ", (a, b) -> b + a);
//        System.out.println(reverse);

        //int[] n = { 2, 4, 3, 5, 7, 8, 9 };
//		GivenSum = 7
//		Output : (2,5) (4,3)
//		int targetSum=7;
//
//
//        Set<Integer> seen = new HashSet<>();
//
//        List<String> pairs = Arrays.stream(n)
//            .filter(num -> seen.contains(targetSum - num) || seen.add(num)) // build up 'seen'
//            .filter(num -> seen.contains(targetSum - num)) // check if pair exists
//            .mapToObj(num -> "(" + (targetSum - num) + ", " + num + ")")
//            .distinct()
//            .collect(Collectors.toList());
//
//        pairs.forEach(System.out::println);


        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> records = data.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(records);





    }
}
