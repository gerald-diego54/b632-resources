package com.joysistvi.stage1.day4;

public class TestClass {

    public static void main(String[] args) {

        Student student = new Student("Gerald", 12345, 25);

        TestClass testClass = new TestClass();
        testClass.implementTypeClass(student);
    }

    public void implementTypeClass(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Age: " + student.getAge());
    }
}

class Student {

    private final String name;
    private final int studentId;
    private final int age;

    public Student(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getAge() {
        return age;
    }
}
