

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class palindrome {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("level", "world", "madam", "hello");

        List<String> palindromes = words.stream()
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (a, b) -> b + a))       // reverse each word
                .filter(r-> words.contains(r)) // check if original list contains it
                .toList();

        System.out.println(palindromes);

        String[] newWord = {"level", "world", "madam", "hello", "racecar"};

        List<String> palindrome = Arrays.stream(newWord)
                .map(word -> Arrays.stream(word.split(""))
                        .reduce("", (a, b) -> b + a)
                )
                .filter(r -> Arrays.asList(newWord).contains(r))
                .toList();

        System.out.println(palindrome);








    }




}
