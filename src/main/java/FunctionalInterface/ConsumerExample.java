package FunctionalInterface;

import data.Student;

import java.util.List;
import java.util.function.Consumer;

//consumer consumes, and has no return type
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) ->
                System.out.println(s.toUpperCase());
        consumer.accept("abc");
    }

    static Consumer<List<Student>> studentConsumer = (s) -> {
        s.stream().forEach(System.out::println);
    };


    public static void StudentListConsumer(List<Student> students) {
        studentConsumer.accept(students);
    }
}
