import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Abc {
    public static void main(String[] args) {

        List<Integer> l= Arrays.asList(1, 2, 3, 1, 4, 2, 1, 3, 5, 3, 1);
        List<Integer> list = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 2 || x.getValue()==3).map(Map.Entry::getKey).toList();

        System.out.println(list);

    }
}
