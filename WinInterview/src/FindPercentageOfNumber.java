import java.util.*;

public class FindPercentageOfNumber {
    public static void main(String[] args) {


        List<Integer> data = Arrays.asList(10,200,4000,1,4,200,1,5,2000,12);

        List<Double> list = data.stream().filter(x -> x >= 2000).map(x -> x - (x * 0.17)).toList();

        System.out.println(list);
    }

}
