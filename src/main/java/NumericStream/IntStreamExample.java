package NumericStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {
    //this is used for primitive type
    //Double range and range closed is also there
    //range exclude last , range closed include last
    public static int getSumIntRange() {
        return IntStream.range(1, 100).sum();

    }
    public static int getSumRangeClosed() {
        return IntStream.rangeClosed(1, 100).sum();

    }
    //self trial
//    public static int getSum2(List<Integer>integerList){
//        // it cannot be used instead of stream ,
//        //it can be used with its own specific method to work on primitive types
//    }

    public static void main(String[] args) {
        System.out.println(getSumIntRange());
        System.out.println(getSumRangeClosed());
        //List<Integer> list= List.of(1, 2, 3, 4, 5, 6, 7);

    }
}
