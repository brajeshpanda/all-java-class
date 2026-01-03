import java.util.*;

class RaughCalss {
    public static void main(String[] args) {


        List<Integer> l = Arrays.asList(3, 5, 7, 9);

        long count = l.stream().filter(n -> n > 2).count();

        if(count>0)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }


//        List<String> l= Arrays.asList("a","bb","cccc");
//
//        List<Integer> list = l.stream().mapToInt(String::length).mapToObj(i -> (int) i).toList();
//        System.out.println(list);
//
//        List<Integer> result = l.stream().map(String::length).collect(Collectors.toList());
//        System.out.println(result);

//
//           List<Integer> l = Arrays.asList(10, 20, 30, 40);
//
//        double average = l.stream().mapToInt(Integer::intValue).average().orElseThrow();
//
//        System.out.println(average);



//        List<String> l= Arrays.asList("RaughCalss","B","C");
//
//        String collect = l.stream().collect(Collectors.joining(","));
//
//        System.out.println(collect);


//List<Integer> l = Arrays.asList(1,2,2,3,3,3,4);
//
//        Map<Integer, Long> collect = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//        System.out.println(collect);


//      String s= "javaspringawsmicroservices";
//
//        Long collect = Arrays.stream(s.split("")).collect(Collectors.counting());
//
//        System.out.println(collect);
//
//
//        List<String> l = Arrays.asList("java","spring","aws","microservices");
//
//        int sum1 = l.stream().mapToInt(String::length).sum();
//
//        System.out.println(sum1);
//
//        String[] x= {"java","spring","aws","microservices"};
//
//        int sum = Arrays.stream(x).mapToInt(String::length).sum();
//
//        System.out.println(sum);


//
//        String s= "aabbcde";
//
//        List<Character> singleOccuranceCharacter = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().filter(n -> n.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
//
//
//        System.out.println(singleOccuranceCharacter);


//        List<Integer> l = Arrays.asList(5, 1, 2, 9, 3);
//
//        Integer secondHighest = l.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElseThrow();
//
//        System.out.println(secondHighest);
//
//        Integer secondNo =l.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).skip(1).findFirst().orElseThrow();
//
//        System.out.println(secondNo);




//     List<String> l= Arrays.asList("apple","banana","grape","orange");
//
//
//
//        String longestString = l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst().orElseThrow();
//
//        System.out.println(longestString);
//
//        String LongestWord = l.stream().max(Comparator.comparing(String::length)).orElseThrow();
//        System.out.println(LongestWord);



//  List<Integer> l = Arrays.asList(2, 4, 3, 5, 7, 8, 9);
//
//  int sum=10;
//
//        List<String> findPairSum = l.stream().flatMap(num -> l.stream().filter(num1 -> num + num1 == sum && num < num1)
//                .map(num1 -> "(" + num + "," + num1 + ")")).toList();
//
//        System.out.println(findPairSum);

    }
}
