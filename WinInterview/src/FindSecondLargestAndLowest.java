import java.util.*;
import java.util.stream.Collectors;

public class FindSecondLargestAndLowest {

    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(2,5,1,6,1,22,6,32,2,1,1,4, 6756);

        Integer largestNumber = l.stream().sorted(Comparator.reverseOrder()).findFirst().orElseThrow();
        System.out.println(largestNumber);

        Integer SecondLargestNumber = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
        System.out.println(SecondLargestNumber);


        Integer lowestNumber = l.stream().sorted().distinct().findFirst().orElseThrow();
        System.out.println(lowestNumber);

        Integer secondLowestNumber = l.stream().distinct().sorted().skip(1).findFirst().orElseThrow();
        System.out.println(secondLowestNumber);

        double avg = l.stream().distinct().mapToInt(Integer::intValue).average().orElseThrow();
        System.out.println(avg);

    }
}
