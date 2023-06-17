package data;

import java.util.List;

public class StudentDatabase {
    Student ramesh= new Student("Ramesh",1, List.of("cricket", "reading"),"A");
    Student suresh= new Student("Suresh",2, List.of("swimming", "reading"),"B");
    Student tiku= new Student("Tiku",3, List.of("cricket", "running"),"A");
    Student chiku= new Student("Chiku",4, List.of("football", "reading"),"C");
    Student manas= new Student("Manas",5, List.of("hockey", "reading"),"A");
    Student rahul= new Student("Rahul",6, List.of("beekeeping", "reading"),"A");


    public List<Student>getStudent(){
        return List.of(rahul,ramesh,chiku,tiku,manas,suresh);
    }

}
