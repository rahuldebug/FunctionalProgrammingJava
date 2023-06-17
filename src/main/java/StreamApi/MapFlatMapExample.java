package StreamApi;

import data.Student;
import data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapExample {
    // distinct are also being captured here
    public static List<String> getAllActivities() {
        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
//count
    public static int getAllActivitiesDistinctCount() {
        return (int) StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
//sorting
    public static List<Student> getSortedList() {
        return StudentDatabase.getStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }
    public static List<String> getSortedName() {
        return StudentDatabase.getStudents().stream()
                .map(Student::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getAllActivities());
        System.out.println(getAllActivitiesDistinctCount());
        System.out.println(getSortedList());
        System.out.println(getSortedName());
    }
}
