package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    static Function<String, Integer> function = (name) -> {
        return name.length();
    };
    static BiFunction<String, String, Integer> funtion2 = (n1, n2) -> {
        if (n1.length() == n2.length()) return 0;
        else if (n1.length()<n2.length()) return -1;
        else return 1;
    };

    public static void main(String[] args) {

        System.out.println(function.apply("rahul"));
        System.out.println(funtion2.apply("rahul","choudhary"));
    }
}
