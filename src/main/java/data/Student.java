package data;

import java.util.List;

public class Student {
    public String getEmail() {
        return email;
    }

    public Student(String email, String name, int rollNumber, List<String> activities, String grades, double avgMarks) {
        this.email = email;
        this.name = name;
        this.rollNumber = rollNumber;
        this.activities = activities;
        this.grades = grades;
        this.avgMarks = avgMarks;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;
    String name;

    int rollNumber;

    List<String> activities;
    String grades;

    double avgMarks;
//    public Student(String name, int rollNumber, List<String> activities, String grades , double avgMarks) {
//        this.name = name;
//        this.rollNumber = rollNumber;
//        this.activities = activities;
//        this.grades = grades;
//        this.avgMarks=avgMarks;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgMarks() {
        return avgMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", activities=" + activities +
                ", grades='" + grades + '\'' +
                ", avgMarks=" + avgMarks +
                '}';
    }

    public void setAvgMarks(double avgMarks) {
        this.avgMarks = avgMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

}
