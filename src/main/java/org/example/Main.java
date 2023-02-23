package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String,Student> studentHashMap = new HashMap<>();
        Student Student1 = new Student("Diego",90);
        Student Student2 = new Student("Anthony",90);
        Student Student3 = new Student("Seba",90);
        Student Student4 = new Student("Pere",90);
        Student Student5 = new Student("Joan",90);

        studentHashMap.put(Student1.getName(), Student1);
        studentHashMap.put(Student2.getName(),Student2);
        studentHashMap.put(Student3.getName(), Student3);
        studentHashMap.put(Student4.getName(), Student4);
        studentHashMap.put(Student5.getName(), Student5);

        System.out.println(studentHashMap);
        Student.increaseGrades(studentHashMap);

        System.out.println(studentHashMap);




    }

    private static Map<String, Student> increaseGrades(HashMap<String, Student> studentHashMap) {
        return null;

    }

}