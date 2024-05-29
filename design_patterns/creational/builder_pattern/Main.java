package design_patterns.creational.builder_pattern;

public class Main {
    public static void main(String[] args) {
        Director student1=new Director(new EngineeringStudentBuilder());
        Director student2=new Director(new MBAStudentBuilder());
        System.out.println(student1.createStudent());
        System.out.println(student2.createStudent());

    }
}
