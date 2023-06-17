package data;

import java.util.List;

public class Student {
    String name;

    int rollNumber;

    List<String> activities;
    String grades;

    double avgMarks;
    public Student(String name, int rollNumber, List<String> activities, String grades , double avgMarks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.activities = activities;
        this.grades = grades;
    }

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
