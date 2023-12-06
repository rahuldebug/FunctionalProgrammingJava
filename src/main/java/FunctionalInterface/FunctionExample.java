package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,Integer> function=(name)->{return name.length();};
    public static void main(String[] args) {

        System.out.println(function.apply("rahul"));
    }
}
