package com.company;

/**
 * Created by sf3600 on 2/5/2019.
 */
public class Student {
    private int studentID;
    private String name;
    private double contentGrade;
    private double workHabitGrade;
    private double participation;
    private int age;

    public Student(String Name, int ID, int Age) {
        name = Name;
        studentID = ID;
        age = Age;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
    }
    public Student() {
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }
    public void SetContentGrade(int grade) {
        contentGrade = grade;
    }

    public void SetWorkHabitGrade(int grade) {
        workHabitGrade = grade;
    }

    public void SetParticipation(int grade) {
        participation = grade;
    }

    public double GetGrade() {
        return (.35*workHabitGrade) + (.4*contentGrade) + (.25*participation);

    }

    public void printGrade() {
        System.out.println(GetGrade());
    }
}
