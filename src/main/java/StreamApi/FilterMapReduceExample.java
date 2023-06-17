package StreamApi;

import data.Student;
import data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class FilterMapReduceExample {

    //filter and map
    public static List<Double> getByGrades() {
        return StudentDatabase.getStudents().stream()
                .map(Student::getAvgMarks)
                //  .filter((student)->student.getGrades().equals("A"))
                .filter((m) -> m > 80)
                //.collect(student::name,)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(getByGrades());
    }
}
