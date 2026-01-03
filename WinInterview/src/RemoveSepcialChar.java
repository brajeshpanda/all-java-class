import java.util.*;

public class RemoveSepcialChar {
    public static void main(String[] args) {
        String str = "aab cx 1 @ cd";

        // Remove non-alphabet characters
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}

