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
        
//        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);
//        
//        long count = numbers.stream().filter(n ->n%2==0).map(n ->n*n).count();
//        System.out.println(count);
//        
        
        
        
        
//        LocalDateTime now = LocalDateTime.now();
//        
//        System.out.println(now);
//        
//        DayOfWeek dayOfWeek = now.getDayOfWeek();
//        System.out.println(dayOfWeek);
//        int dayOfMonth = now.getDayOfMonth();
//        System.out.println(dayOfMonth);
//        
        
        

        List<Integer> result = numbers.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(n -> n.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Numbers with single occurrence: " + result);
        
//        Map<Integer, Integer> occurrenceMap = new HashMap<>();
//
//        // Count occurrences
//        for (Integer number : numbers) {
//            occurrenceMap.put(number, occurrenceMap.getOrDefault(number, 0) + 1);
//        }
//
//        // Find numbers with single occurrence
//        List<Integer> result = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
//            if (entry.getValue() == 1) {
//                result.add(entry.getKey());
//            }
//        }
//
//        System.out.println("Numbers with single occurrence: " + result);
    }
}
