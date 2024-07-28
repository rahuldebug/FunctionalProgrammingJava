package InterviewQuestions;

import java.util.List;
////max min mapToInt reduce orElseThrow
public class PracticeQuestions {
    public static void main(String[] args) {
        List<Integer> aList = List.of(1, 2, 3, 3, 4, 5, 6, 7, 7, 8, 9, 10, 99);
        //max min mapToInt reduce orElseThrow
        //max //min can also be calculated
        int max = aList.stream().reduce(Integer::max).orElseThrow();
        System.out.println("max is ::" + max);
        int max1 = aList.stream().mapToInt(e -> e).max().orElseThrow();
        System.out.println(max1);
        int max2 = aList.stream().max((a, b) -> a - b).orElseThrow();
        System.out.println(max2);
        //reduce== identity (initial value ) + Accumulator + Combiner

        int sumV = aList.stream().reduce(0, (sum, element) -> sum + element);
        System.out.println(sumV);








    }


    //max

}
