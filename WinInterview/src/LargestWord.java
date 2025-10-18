
import java.util.Arrays;
import java.util.List;

public class LargestWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "grape", "orange", "watermelon");

        // Use the Stream API to find the largest word
//        String largestWord = words.stream()
//                .max((word1, word2) -> Integer.compare(word1.length(), word2.length()))
//                .orElse(null);
//        
//        String largestWord = words.stream()
//                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
//                .orElse(null);
        
        String largestWord = words.stream().sorted((a,b)->b.compareTo(a)).findFirst().orElse(null);

        if (largestWord != null) {
            System.out.println("Largest word: " + largestWord);
        } else {
            System.out.println("List is empty");
        }
    }
}

