import java.util.*;
import java.util.stream.Collectors;

public class FindPairSum {

    public static void main(String[] args) {




        //int[] n = { 2, 4, 3, 5, 7, 8, 9 };
//		GivenSum = 7
//		Output : (2,5) (4,3)
//		int targetSum=7;

                List<Integer> list = Arrays.asList(2, 4, 3, 5, 7, 8, 9);
                int targetSum = 7;

                Set<String> result = list.stream()
                        .flatMap(a -> list.stream()
                                .filter(b -> a + b == targetSum && a < b)
                                .map(b -> "(" + a + "," + b + ")"))
                        .collect(Collectors.toSet());

        System.out.println(result);






    }
}
