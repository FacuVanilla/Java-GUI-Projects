package com.oluwaseun;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // PROGRAM TO KEEP TRACK OF THE FINANCE SITUATION OF A SCHOOL (Onward Academy).

        // STUDENTS ON Onward Academy.
        List<Student> students = new ArrayList<Student>();

        Student Queen = new Student("Queen Olagunju", 1, 3000);
        Student Sheriff = new Student("Sheriff Omolere", 2, 3000);
        Student Taiwo = new Student("Taiwo Ojeniran", 3, 3000);
        Student Damola = new Student("Damola Opawusi", 4, 3000);

        students.add(Queen);
        students.add(Sheriff);
        students.add(Taiwo);
        students.add(Damola);

        // TEACHERS ON Onward Academy.
        List<Teacher> teachers = new ArrayList<Teacher>();

        Teacher Seun = new Teacher("Seun Adedayo", 101, 800);
        Teacher Philip = new Teacher("Philip Olaniyi", 102, 1200);
        Teacher Pleasant = new Teacher("Pleasant Omisakin", 103, 1600);
        Teacher Ronke = new Teacher("Ronke Owolabi", 104, 2000);

        teachers.add(Seun);
        teachers.add(Philip);
        teachers.add(Pleasant);
        teachers.add(Ronke);

        // CREATING THE SCHOOL (Onward).
        School Onward = new School(students, teachers);

        // STUDENT PAYMENTS
        Queen.updateFeesPaid(100);
        Sheriff.updateFeesPaid(250);
        Taiwo.updateFeesPaid(500);
        Damola.updateFeesPaid(1500);
        Queen.updateFeesPaid(1500);
        Taiwo.updateFeesPaid(1250);

        // SALARY PAID TO TEACHERS.
        Seun.paySalary();
        Philip.paySalary();
        Pleasant.paySalary();
        Ronke.paySalary();

        // PRINT FULL FINANCE REPORT.
        System.out.println(Onward.toString());
    }
}
