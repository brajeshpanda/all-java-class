import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OperationOnWindow {
    public static void main(String[] args) {


        List<Integer> l = Arrays.asList(4, 8, 15, 16, 23, 42);

        int window = 3;

        List<Integer> list = IntStream.range(0, (l.size() -  (window - 1)))
                .mapToObj(i -> (l.get(i) + l.get(i + 1) + l.get(i + 2))).sorted(Comparator.reverseOrder()).toList();

        System.out.println(list);

        String s="my name! is Brajesh and java is interesting! and java is powerful";

        List<Map.Entry<String, Long>> list1 = Arrays.stream(s.toLowerCase().replaceAll("[^a-z\\s]", "").split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3).toList();

        System.out.println(list1);



    }
}
