package com.ashish.deom;

import java.util.List;

public class App {

	public static void main(String[] args) {

        IStudentDao studentDao = new StudentDao();

        // test saveStudent
        Student student = new Student("Ashish", "Poudel", "ashishpoudel523@gmail.com");
        studentDao.saveStudent(student);

        // test getStudentById
        Student student2 = studentDao.getStudentById(student.getId());

        // test getAllStudents
        List < Student > students = studentDao.getAllStudents();
        students.forEach(student1 -> System.out.println(student1.getId()));

        // test deleteStudent
        studentDao.deleteStudent(student.getId());

    }
}
