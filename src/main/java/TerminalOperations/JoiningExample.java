package TerminalOperations;

import data.Student;
import data.StudentRepository;

import java.util.stream.Collectors;

public class JoiningExample {
    public static String getConcat()
    {
        return StudentRepository.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String getConcat2(){
        return  StudentRepository.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(","));
    }

    public static String getConcat3(){
        return StudentRepository.getStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining(",","(",")"));
    }

    public static void main(String[] args) {
        System.out.println(getConcat());
        System.out.println(getConcat2());
        System.out.println(getConcat3());
    }
        }
