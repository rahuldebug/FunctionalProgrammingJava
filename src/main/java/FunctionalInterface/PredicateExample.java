package FunctionalInterface;
// Supplier , consumer and predicate mix
import data.Student;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//predicate return type is boolean
public class PredicateExample {
    static Predicate<Integer> p1 = (i) -> {
        return i % 2 == 0;
    };
    static Predicate<Integer> p2 = (i) -> {
        return i % 5 == 0;
    };

    static Predicate<Student> p3 = (l) -> l.getAvgMarks() > 100;

    public static void main(String[] args) {
        System.out.println(p1.test(10));
        System.out.println(p1.and(p2).test(10));
        List<Student> result = SupplierExample.supplyStudent.get()
                .stream()
                .filter(p3)
                .toList();
        ConsumerExample.studentConsumer.accept(result);
    }
}
