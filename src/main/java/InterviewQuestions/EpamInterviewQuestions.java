package InterviewQuestions;

import data.Student;
import data.StudentRepository;

import java.util.Arrays;
import java.util.HashSet;
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
//distinct domain
        HashSet <String> count= new HashSet<>();
        StudentRepository.getStudents().stream()
                .map(Student::getEmail)
                .map(e->{return e.substring(e.indexOf("@")+1);})
                .filter(e->count.add((String) e)).forEach(System.out::println);


    }
    private static List<String> Capitalizer(List<String> aList) {
        return aList.stream()
                .map(e -> {
                    return e.substring(0, 1).toUpperCase() + e.substring(1, e.length());
                })
                .collect(Collectors.toList());
    }


}
