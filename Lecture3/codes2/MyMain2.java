package com.college;

import com.college.student.MyStudent;
import com.college.teacher.MyTeacher;
import com.college.student.studentDetails.StudentDetails;
import com.college.teacher.teacherDetails.TeacherDetails;

public class MyMain2 {
    public static void main(String[] args) {
        System.out.println("Hello from MyMain class!");

        MyStudent student = new MyStudent();
        student.print();

        MyTeacher teacher = new MyTeacher();
        teacher.print();

        StudentDetails studentDetails = new StudentDetails();
        studentDetails.print();

        TeacherDetails teacherDetails = new TeacherDetails();
        teacherDetails.print();
    }
}