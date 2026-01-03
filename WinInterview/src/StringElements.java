import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringElements {
    public static void main(String[] args) {

        List<String> l= Arrays.asList( "apple" , "banana" , "dog" , "ball" ,"apple" ,  "banana" ,  "banana" ,"dog");

        Map<Integer, List<String>> collect = l.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);



        Map<String, Long> collect2 = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect2);




    }
}
