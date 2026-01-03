import java.util.*;
import java.util.stream.Collectors;


public class ReverseSentence {
    public static void main(String[] args) {
        String s = "This is this a sample sentence to reverse using stream api";
//
//        // Split the sentence into words
        String[] words = s.split(" ");

        // Reverse the order of the words using the Stream API
        String reversedSentence = Arrays.stream(words)
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("");

        System.out.println("Original sentence: " + s);
        System.out.println("Reversed sentence: " + reversedSentence);

        Set<String> v= new HashSet<>();

        String duplicateWord = Arrays.stream(words).map(a -> a.toLowerCase()).filter(a -> !v.add(a)).findFirst().orElseThrow();


        System.out.println(duplicateWord);



    }
}



