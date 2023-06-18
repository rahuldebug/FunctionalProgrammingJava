package StreamApi;

import data.StudentRepository;

public class MatchAndFindExample {

    public static boolean anyMatch() {
        return StudentRepository.getStudents()
                .stream()
                .anyMatch((student -> student.getAvgMarks()>90));
    }
    public static boolean allMatch() {
        return StudentRepository.getStudents()
                .stream()
                .allMatch((student -> student.getAvgMarks()>60));
    }
    public static boolean noneMatch() {
        return StudentRepository.getStudents()
                .stream()
                .noneMatch((student -> student.getAvgMarks()==100));
    }
    public static boolean noneMatch2() {
        return StudentRepository.getStudents()
                .stream()
                .noneMatch((student -> student.getName().contains("Rahul")));
    }
    public static void main(String[] args) {
        System.out.println(anyMatch());
        System.out.println(allMatch());
        System.out.println(noneMatch());
        System.out.println(noneMatch2());
    }

}
