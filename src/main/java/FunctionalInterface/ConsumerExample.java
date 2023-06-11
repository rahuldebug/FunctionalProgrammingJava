package FunctionalInterface;

import java.util.function.Consumer;
//consumer consumes, and has no return type
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (s) ->
                System.out.println(s.toUpperCase());
        consumer.accept("abc");
    }

}
