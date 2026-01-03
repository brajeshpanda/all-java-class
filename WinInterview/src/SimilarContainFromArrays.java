import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SimilarContainFromArrays {
    public static void main(String[] args) {

        String[] arr1 = {"RaughCalss", "B", "C", "D"};
        String[] arr2 = {"B", "C", "E", "F"};

        List<String> commonElements = Arrays.stream(arr1)
                .filter(x -> Arrays.stream(arr2).anyMatch(x::equals))
                .collect(Collectors.toList());

        System.out.println(commonElements);

        List<Integer> list = Arrays.asList(10, 20, 30);

        Integer[] array = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));


    }
}
