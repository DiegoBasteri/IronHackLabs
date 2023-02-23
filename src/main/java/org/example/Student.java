package org.example;

import java.util.Map;
import java.util.Objects;

public class Student {
    private String name;
    private  int grade;

    public Student(String name, int grade) {
        this.name = name;
        setGrade(grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade < 0) {
            this.grade = 0;
        } else if (grade > 100){
            this.grade = 100;
        }else {
            this.grade = grade;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    public static Map<String, Student> increaseGrades(Map<String, Student> students) {
        for (Student student : students.values()) {
            student.setGrade((int) (student.getGrade() * 1.1));

        }
        return students;
    }

}

