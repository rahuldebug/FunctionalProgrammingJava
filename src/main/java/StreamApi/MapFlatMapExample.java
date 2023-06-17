package StreamApi;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapExample {
    // distinct are also being captured here
    public static  List<String> getAllActivities(){
        return StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
    public static int getAllActivitiesDistinctCount(){
        return (int) StudentDatabase.getStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println(getAllActivities());
        System.out.println(getAllActivitiesDistinctCount());
    }
}
