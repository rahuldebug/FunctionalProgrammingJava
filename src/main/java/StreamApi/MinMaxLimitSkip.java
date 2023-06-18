package StreamApi;

import data.Student;
import data.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MinMaxLimitSkip {
    public static double getMin() {
        return StudentRepository.getStudents().stream()
                .map(Student::getAvgMarks)
                .reduce(Double.MAX_VALUE, Double::min);
    }

    public static double getMax() {
        return StudentRepository.getStudents().stream()
                .map(Student::getAvgMarks)
                .reduce(Double.MAX_VALUE, Double::max);
    }

    public static List<Student> testLimit(){
        return StudentRepository.getStudents().stream()
                .limit(5)
                //.map(Student::getAvgMarks)
                .collect(Collectors.toList());

    }
    public static List<Student> testSkip(){
        return StudentRepository.getStudents().stream()
                .skip(2)
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println(getMin());
        System.out.println(getMax());
        System.out.println(testSkip());
        System.out.println(testLimit());
    }
}
