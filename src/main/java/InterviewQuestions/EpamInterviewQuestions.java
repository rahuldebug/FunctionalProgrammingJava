package InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EpamInterviewQuestions {
    public static void main(String[] args) {
        String str = "I am doing an interview at EPAM I work for EPAM ";
        List<String> strList = Arrays.stream(str.split(" ")).toList();
        var result = strList.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        for (String key : result.keySet()) {
            if (result.get(key) > 1) {
                System.out.println("the word is:: " + key + " value is ::" + result.get(key));
            }
        }
    }

}
