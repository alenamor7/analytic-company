package com.ac.objects;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Student einstein = new Student("Albert Einstein", "0054");
        Student gauss = new Student("Carl Friedrich Gauss", "5421");
        Student leibniz = new Student("Gottfried Wilhelm Leibniz", "1234");

        List<Student> students = new ArrayList<>();
        students.add(einstein);
        students.add(gauss);
        students.add(leibniz);

        /*
        I used lambda expression and streams here.
        I could also make Student class implementing Comparable interface and overriding compareTo method.
        This solution would allow me to use Collections.sort() or Arrays.sort() in case of array
         */
        students.stream().sorted((student, t1) -> student.getName().compareTo(t1.getName()));

        for (Student student : students) {
            System.out.println(student.getStudentId() + " " + student.getName());
        }
    }
}
