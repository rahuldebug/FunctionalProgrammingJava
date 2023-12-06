package StreamApi;

import data.Student;
import data.StudentRepository;

import java.util.Optional;

public class FindExample {
    public static Optional<Student> findFirst() {
        return StudentRepository.getStudents().stream()
                .filter(s -> (s.getAvgMarks() > 55 && s.getAvgMarks() < 80)).findFirst();
    }

    public static Optional<Student> findAny() {
        return StudentRepository.getStudents().stream()
                .filter(s -> s.getAvgMarks() > 55).findAny();
    }
    //FIND 2nd Heighest
    public static Optional<Student> findsec(){

        return StudentRepository.getStudents().stream()
                .sorted((o1, o2) -> (int) (o2.getAvgMarks() - o1.getAvgMarks() ))
                .skip(1)
                .findFirst();
    }

    public static void main(String[] args) {
        //System.out.println(findAny());
        //System.out.println(findFirst());
        System.out.println(findsec());
    }
}
