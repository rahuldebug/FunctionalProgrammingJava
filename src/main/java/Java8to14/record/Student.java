package Java8to14.record;
//java 14 feature , this is used to create immutable class

import java.util.List;

record Student(String name, String rollCall, List<String> subjects) {
}

