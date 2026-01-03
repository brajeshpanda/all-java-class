
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "watermelon");



        String s = words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst()
                .orElseThrow();

        System.out.println(s);


    }
}

