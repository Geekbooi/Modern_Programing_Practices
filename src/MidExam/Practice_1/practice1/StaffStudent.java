package MidExam.Practice_1.practice1;

import java.util.Date;

public class StaffStudent extends Staff{

    private Student student;
    private Date firstCourseRegisterDate;
    public StaffStudent(String name, String phone, int age, double salary,double gpa) {
        super(name, phone, age, salary);
        student = new Student(name,phone,age,gpa);
    }
    public Student getStudent() {
        return student;
    }


    @Override
    public void addCourse(Course c) {
        if(firstCourseRegisterDate == null) {
            firstCourseRegisterDate = new Date();
            System.out.println("The first course for "+student.getName()+" registered at: " + firstCourseRegisterDate);
        }
        student.addCourse(c);
    }
}
