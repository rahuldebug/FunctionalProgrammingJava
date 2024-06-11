package Java8to14.record;
//java 14 feature , this is used to create immutable class
//It extends java.lang.record
//It is not completely immutable , in case of collection ,
// we should override the constructor aas given below

import java.util.List;

record Student(String name, String rollCall, List<String> subjects) {

    Student(String name, String rollCall, List<String> subjects) {
        this.name = name;
        this.rollCall = rollCall;
        this.subjects = List.copyOf(subjects);
    }
}

