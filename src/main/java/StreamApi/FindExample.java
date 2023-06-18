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

    public static void main(String[] args) {
        System.out.println(findAny());
        System.out.println(findFirst());
    }
}
