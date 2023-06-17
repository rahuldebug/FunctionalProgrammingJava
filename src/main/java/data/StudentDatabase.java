package data;

import java.util.List;

public class StudentDatabase {
    static Student ramesh= new Student("Ramesh",1, List.of("cricket", "reading"),"A");
    static Student suresh= new Student("Suresh",2, List.of("swimming", "reading"),"B");
    static Student tiku= new Student("Tiku",3, List.of("cricket", "running"),"A");
    static Student chiku= new Student("Chiku",4, List.of("football", "reading"),"C");
    static Student manas= new Student("Manas",5, List.of("hockey", "reading"),"A");
    static Student rahul= new Student("Rahul",6, List.of("beekeeping", "reading"),"A");


    public static List<Student> getStudents(){
        return List.of(rahul,ramesh,chiku,tiku,manas,suresh);
    }

}
