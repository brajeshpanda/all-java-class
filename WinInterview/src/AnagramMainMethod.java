import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramMainMethod {
    public static void main(String[] args) {
//
        String s1 = "listen";
        String s2 = "silent";

        boolean result = s1.length() == s2.length() &&
                s1.chars().mapToObj(c->(char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .equals(
                                s2.chars().mapToObj(c->(char)c)
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        );

        if (result) {
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        } else {
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");
        }
        String[] words = {"listen", "silent", "enlist", "hello", "world", "dog", "god", "act", "cat", "tac"};

        Map<Map<Character, Long>, List<String>> collect = Arrays.stream(words)
                .collect(Collectors.groupingBy(
                        word -> word.chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))

                ));

        System.out.println(collect);

    }
}



