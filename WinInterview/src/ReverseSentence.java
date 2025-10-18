import java.util.*;


public class ReverseSentence {
    public static void main(String[] args) {
        String s = "This is a sample sentence to reverse using stream api";

        // Split the sentence into words
        String[] words = s.split(" ");

        // Reverse the order of the words using the Stream API
        String reversedSentence = Arrays.stream(words)
                .reduce((word1, word2) -> word2 + " " + word1)
                .orElse("");

        System.out.println("Original sentence: " + s);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}



