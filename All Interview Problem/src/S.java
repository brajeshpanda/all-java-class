import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class S {
    public static void main(String[] args) {




        List<Integer> data = Arrays.asList(10,200,4000,1,4,200,1,5,2000,12);

      Optional<Integer> max =data.stream().max(Integer::compareTo);

        System.out.println(max.get());

        Optional<Integer> min = data.stream().min(Integer::compareTo);

        System.out.println(min.get());


//        List<Employee> employee = Arrays.asList(
//                new Employee(1, "Brajesh", 20000),
//                new Employee(2, "rajesh", 10000),
//                new Employee(3, "ramesh", 30000),
//                new Employee(4, "rakesh", 5000)
//                );





//
//        List<String> r = Arrays.asList("Brajesh","rajesh","ramesh","suresh","ramesh","rajesh");
//
//        Map<String, List<String>> groupedByName=r.stream().collect(Collectors.groupingBy(Function.identity()));
//        groupedByName.forEach((name, group) ->
//                System.out.println(name + " => " + group));












//        List<Integer> data = Arrays.asList(10,200,4000,1,4,200,1,5,2000,12);
//
//data.stream().filter(x->x>=2000).map(x->x-(x*0.17)).forEach(x-> System.out.println(x));







//        Data.stream().filter(x->x%2==0).sorted().distinct().forEach(x-> System.out.println(x));


        //        //it takes input and does not produce any output
//        Consumer c=x-> System.out.println(x);
//        c.accept(100);

//
//        //it does not take input but produce output
//        Supplier n=()-> "BRAJESH";
//        System.out.println(n.get());

    }

}
