package ConstructorMethodRefrence;

import data.Student;
import data.StudentRepository;

import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public List<String> getNameOfStudents() {
     return   StudentRepository.getStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MethodReferenceExample example= new MethodReferenceExample();
        System.out.println(example.getNameOfStudents());
    }
}
