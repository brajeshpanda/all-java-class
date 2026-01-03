import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {

    public static void main(String[] args) {

        String s= "hello iam Brajesh Kumar panda and ilove java and java is simple but i am felt to getting that";

        List<String> collect = Arrays.stream(s.split(" "))
                .map(word -> Arrays.stream(word.split(" ")).reduce("", (a, b) -> b +" "+ a)).collect(Collectors.toList());

        System.out.println(collect);


    }

}
