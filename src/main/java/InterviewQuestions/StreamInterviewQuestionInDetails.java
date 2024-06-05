package InterviewQuestions;

import data.Student;

import java.util.*;
import java.util.stream.Collectors;

public class StreamInterviewQuestionInDetails {
    public static void main(String[] args) {
        List<Integer> aList = Arrays.asList(1, 22, 22, 21, 2111, 21, 3, 4, 9, 7, 299);
        List<Integer> aList2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        nLargest(aList2,3);
//        int result = sum(aList).orElseThrow();
//        System.out.println(result);
//        double average = avg(aList);
//        System.out.println(average);
//        getDuplicate(aList);
//        System.out.println(getMax(aList).orElseThrow());
//        System.out.println(getMin(aList).orElseThrow());
    }


    private static Optional<Integer> sum(List<Integer> aList) {
        //both can be used
        return aList.stream().reduce((a, b) -> a + b);

        //  return aList.stream().reduce(Integer::sum);
    }

    public static Double avg(List<Integer> aList) {
        return aList.stream().mapToInt(e -> e).average().getAsDouble();

    }
    // map is a function used to convert one type of object to another
    // mapToInt is used to perform integer related operation


    //map example
    public List<Integer> square(List<Integer> alist) {
        return alist.stream().map(e -> e * e).collect(Collectors.toList());
    }

    //map and reduce
    public Optional<Integer> sumOfSquare(List<Integer> aList) {
        return aList.stream().map(e -> e * e).reduce(Integer::sum);
    }
    //map and filter

    public Map<String, Double> mapOfStudents(List<Student> studentLists) {
        return studentLists.stream()
                .filter(s -> s.getAvgMarks() > 50)
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getAvgMarks()));
    }

    //even and odd
    public List<Integer> getEven(List<Integer> aList) {
        return aList.stream()
                .filter((a) -> a % 2 == 0)
                .collect(Collectors.toList());
    }

    //odd
    public List<Integer> getOdd(List<Integer> aList) {
        return aList.stream()
                .filter((a) -> a % 2 != 0)
                .collect(Collectors.toList());
    }

    //prefix 2
    public static void prefix2(List<Integer> aList) {
        aList.stream()
                .map(String::valueOf)
                .filter(e -> e.charAt(0) == '2')
                .map(Integer::valueOf)
                .forEach(System.out::println);
    }

    //contains 2
    public static void contains2(List<Integer> aList) {
        aList.stream()
                .map(String::valueOf)
                .filter(e -> e.contains("2"))
                .map(Integer::valueOf)
                .forEach(System.out::println);
    }

    //print Duplicate

    public static void getDuplicate(List<Integer> aList) {
        Set<Integer> duplicate = new HashSet<>();
        aList.stream().filter(e -> !duplicate.add(e)).forEach(System.out::println);
    }

    public static Optional<Integer> getMax(List<Integer> aList) {
        //return aList.stream().mapToInt(e->e).max();
        return aList.stream().max((a, b) -> a - b);
    }

    public static Optional<Integer> getMin(List<Integer> aList) {
        return aList.stream().min((a, b) -> a - b);
    }

    public static List<Integer> sortedNatural(List<Integer> aList) {
        return aList.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> sortedReverse(List<Integer> aList) {
        return aList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public static void first5(List<Integer> aList) {
        aList.stream().limit(5).forEach(System.out::println);
    }

    public static void skip(List<Integer> aList) {
        aList.stream().skip(3).forEach(System.out::println);
    }

    public static void nLargest(List<Integer> aList ,int n){

        aList.stream().sorted(Comparator.reverseOrder()).skip(n-1).limit(1).forEach(System.out::println);
    }

}
