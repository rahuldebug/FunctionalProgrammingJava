package StreamApi;

import data.StudentDatabase;

public class MatchAndFindExample {

    public static boolean anyMatch() {
        return StudentDatabase.getStudents()
                .stream()
                .anyMatch((student -> student.getAvgMarks()>90));
    }
    public static boolean allMatch() {
        return StudentDatabase.getStudents()
                .stream()
                .allMatch((student -> student.getAvgMarks()>60));
    }
    public static boolean noneMatch() {
        return StudentDatabase.getStudents()
                .stream()
                .noneMatch((student -> student.getAvgMarks()==100));
    }
    public static boolean noneMatch2() {
        return StudentDatabase.getStudents()
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
