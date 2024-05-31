package ImperativeDeclarative;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeDeclarative {
    public static void main(String[] args) {
        System.out.println(sum(100));
        System.out.println(sum2(100));
        List<Integer> l=Arrays.asList(1,1,2,3,3,4,4,5);
        getDistict(l);

    }



    /*imperative , we are writing our own logic
* we are modifing objects , mutability
* */
    static int sum(int range){
        int cal=0;
        for (int i=1;i<=range;i++){
            cal+=i;
        }
        return cal;
    }

    /*Declative approach is using inbuilt methods like in sql
    * promotes mutability */
    static int sum2(int range){
        return IntStream.rangeClosed(0,range).sum();
        //return (range->Integer::sum)
    }

    private static List<Integer> getDistict(List<Integer> l) {
       return l.stream().distinct().collect(Collectors.toList());
    }
}
