package design_patterns.creational.builder_pattern;

import java.util.List;

public class Student {
    private int rollNumber;
    private String name;
    private int age;
    private String motherName;
    private String fatherName;
    private List<String> subjects;
    public Student(StudentBuilder builder){
        this.rollNumber=builder.rollNumber;
        this.name=builder.name;
        this.age=builder.age;
        this.fatherName=builder.fatherName;
        this.motherName=builder.motherName;
        this.subjects=builder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + this.rollNumber +
                ", name='" + this.name + '\'' +
                ", age=" + this.age +
                ", motherName='" + this.motherName + '\'' +
                ", fatherName='" + this.fatherName + '\'' +
                ", subject=" + this.subjects +
                '}';
    }
}
