package StreamApi;

import data.Student;
import data.StudentRepository;

public class FilterAndReduce {
    public static double getSum() {
        return StudentRepository.getStudents()
                .stream()
                .map(Student::getAvgMarks)
                .reduce(0.0, (a, b) -> a + b);
    }

    public static double getSumSecondWay() {
        return StudentRepository.getStudents()
                .stream()
                .map(Student::getAvgMarks)
                .reduce(0.0, Double::sum);
    }

    // fetch sum and count or use int value
//    public static double getAvg(){
//        return StudentDatabase.getStudents()
//                .stream()
//                .map(Student::getAvgMarks)
//                .reduce( 0.0,Double::);
//    }
    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getSumSecondWay());
    }

}
