package data;

import java.util.List;

public class StudentRepository  {
    static Student ramesh= new Student("ramesh@gmail.com","Ramesh",1, List.of("cricket", "reading"),"A", 90.22);
    static Student suresh= new Student("suresh@pwc.com","Suresh",2, List.of("swimming", "reading"),"B",89 );
    static Student tiku= new Student("tiku@google.com","Tiku",3, List.of("cricket", "running"),"A",98.11);
    static Student chiku= new Student("chiku@accenture.com","Chiku",4, List.of("football", "reading"),"C",65.11);
    static Student manas= new Student("manas@accenture.com","Manas",5, List.of("hockey", "reading"),"A", 90.01);
    static Student rahul= new Student("rahu@google.com","Rahul",6, List.of("beekeeping", "reading"),"A",90.22);

    static Student xyz= new Student("xyz@dummy.com","XYZ",7,List.of("beekeeping", "reading"),"B",99);


    public static List<Student> getStudents(){
        return List.of(rahul,ramesh,chiku,tiku,manas,suresh,xyz);
    }

}
