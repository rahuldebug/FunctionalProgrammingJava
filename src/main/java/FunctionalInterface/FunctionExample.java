package FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {
    static Function<String,String> function=(name)->{return name.toUpperCase();};
    public static void main(String[] args) {

        System.out.println(function.apply("rahul"));
    }
}
