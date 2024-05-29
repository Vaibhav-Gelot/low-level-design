package design_patterns.creational.builder_pattern;

public class Director {
    StudentBuilder studentBuilder;
    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder){
           return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("AB").setSubjects().build();
    }
    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(1).setAge(22).setName("ABC").setSubjects().build();
    }

}
