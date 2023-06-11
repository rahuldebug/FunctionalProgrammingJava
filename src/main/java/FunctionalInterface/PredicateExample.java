package FunctionalInterface;

import java.util.function.Predicate;

//predicate return type is boolean
public class PredicateExample {
  static  Predicate<Integer> p1=(i)->{return i%2==0;};
  static  Predicate<Integer> p2=(i)->{return i%5==0;};
    public static void main(String[] args) {
        System.out.println(p1.test(10));
        System.out.println(p1.and(p2).test(10));
    }
}
