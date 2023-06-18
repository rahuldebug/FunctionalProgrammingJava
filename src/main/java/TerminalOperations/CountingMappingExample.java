package TerminalOperations;

import data.Student;
import data.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CountingMappingExample {
    public static double countingTest(){
        return StudentRepository.getStudents().stream()
                .map(Student::getAvgMarks)
                .filter((m) -> m > 90)
                .collect(Collectors.counting());

        //this can be replaced by  //  .count();

    }
    public List<String> toMap(){
        return StudentRepository.getStudents().stream()
                .collect(Collectors.mapping(Student::getName,Collectors.toList()));
    }

    public static void main(String[] args) {
        System.out.println(countingTest());
    }
}
