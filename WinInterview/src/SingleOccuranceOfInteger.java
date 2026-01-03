import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleOccuranceOfInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 2, 5, 1, 6, 8,9);

//        LocalDateTime now = LocalDateTime.now();
//        
//        System.out.println(now);
//        
//        DayOfWeek dayOfWeek = now.getDayOfWeek();
//        System.out.println(dayOfWeek);
//        int dayOfMonth = now.getDayOfMonth();
//        System.out.println(dayOfMonth);




        List<Integer> result = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Numbers with single occurrence: " + result);

        String str = "aabbcde";

        Character nonRepeatingChars   = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey).findFirst().orElseThrow();


        System.out.println("Non-repeating characters: " + nonRepeatingChars);

        String s2= "hello Brajesh how are you  dont worry java is simple and java is powerful";

        List<String> collect = Arrays.stream(s2.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(x -> !(x.getValue() == 1))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
