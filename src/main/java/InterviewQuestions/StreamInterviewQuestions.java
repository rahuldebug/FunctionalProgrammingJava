package InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class StreamInterviewQuestions {
    public static void main(String[] args) {
        List<Integer> alist= Arrays.asList(1,2,2,3,4,5,6,7,8,9,10);
        //sum
        System.out.println(alist.stream().reduce(Integer::sum).get());
        System.out.println(alist.stream().reduce((a,b)->a+b).get());


        //new list using map
        Optional<List<Integer>> result= Optional.of(alist.stream().map(a -> a * 2).collect(Collectors.toList()));


        //consumer for printing
        result.get().stream().forEach(System.out::println);


        //maptoint  for average , converting integer to int stream
        System.out.println(alist.stream().mapToInt(e->e).average().getAsDouble());


        //sum
        alist.stream().mapToInt(a->a).sum();


        //filter , squared and converted
        alist.stream().filter(a->a%2==0).map(a->a*a).collect(Collectors.toList());
        alist.stream().filter(a->a%2==0).map(a->a*a).forEach(System.out::println);


        //fetch all the number starting with 2
        alist.stream().map(e->String.valueOf(e))
                .filter(e->e.charAt(0)=='2')
                .map(e->Integer.valueOf(e))
                .forEach(System.out::println);
        //print duplicate values
        HashSet<Integer>duplicate= new HashSet<>();
        alist.stream().filter(e->duplicate.contains(e)).collect(Collectors.toList());
        alist.stream().filter(e->duplicate.contains(e)).forEach(System.out::println);

        //add also returns boolean , that could also have been used

        //max min
        System.out.println(alist.stream().reduce(Integer::max).get());
        System.out.println(alist.stream().reduce(Integer::min).get());

        System.out.println(alist.stream().mapToInt(a->a).max().getAsInt());
        System.out.println(alist.stream().mapToInt(a->a).min().getAsInt());

        //ascending and descending order

        System.out.println(alist.stream().sorted().collect(Collectors.toList()));
        System.out.println(alist.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));

        // sum of first 5 and last 5 numbers
        System.out.println(alist.stream().limit(5).reduce(Integer::sum).get());
        System.out.println(alist.stream().limit(5).mapToInt(e->e).sum());

        //sum of last 5
        System.out.println(alist.stream().skip(6).reduce(Integer::sum).get());

        //2nd highest and 2nd lowest
        System.out.println(alist.stream().distinct().sorted().skip(1).findFirst().get());
        System.out.println(alist.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst().get());

        //comparator direct example and more of interview questions

    }
}
