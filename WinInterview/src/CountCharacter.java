
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacter {

    public static void main(String[] args) {
        String s = "programming";

        String[] x=s.split("");
        
               Map<String, Long> collect = Arrays.stream(x).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
               System.out.println(collect);
    }
}

