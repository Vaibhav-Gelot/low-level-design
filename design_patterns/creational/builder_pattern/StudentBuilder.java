package design_patterns.creational.builder_pattern;

import java.util.List;

public abstract class StudentBuilder {
    protected int rollNumber;
    protected String name;
    protected int age;
    protected String motherName;
    protected String fatherName;
    protected List<String> subjects;

    public StudentBuilder() {
    }

    StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    StudentBuilder fatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    StudentBuilder setSubjects() {
        return null;
    }

    public Student build() {
        return new Student(this);
    }

}
