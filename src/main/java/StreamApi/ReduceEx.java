package StreamApi;

import data.StudentRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceEx {
    public static void main(String[] args) {
        List<Integer> intList= new ArrayList<>();
        intList.add(10);
        intList.add(11);
        intList.add(99);
        intList.add(32);
        intList.add(22);

        intList.stream().forEach(System.out::println);
        Optional<Integer> result=intList.stream().reduce(Integer::max);
        System.out.println("max value is :: "+result.get());
        System.out.println(intList.stream().reduce(Integer::sum));

    }
}
