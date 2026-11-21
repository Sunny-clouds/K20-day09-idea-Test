package com.onik.Demo01;

public class Test01 {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("小黑");
        student.setAge(200);
        student.setClassName("CS101");
        student.setScore(85);

        Student student2 = new Student();
        student2.setName("约翰·多伊");
        student2.setAge(29);
        student2.setClassName("CS101");
        student2.setScore(8);

        Student student3 = student;

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(student.Learn());

        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
