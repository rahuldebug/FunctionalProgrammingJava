package TerminalOperations;

import data.Student;
import data.StudentRepository;

import java.util.stream.Collectors;

public class CountingExample {
    public static double countingTest(){
        return StudentRepository.getStudents().stream()
                .map(Student::getAvgMarks)
                .filter((m) -> m > 90)
                .collect(Collectors.counting());

        //this can be replaced by  //  .count();

    }
}
