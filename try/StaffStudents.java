package school_lab;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StaffStudents extends students{

    private double salary;
    private double GPA;
    private LocalDateTime dateTime;
    private List<Staff> courseList = new ArrayList<Staff>();

    public class StaffStudent extends Student{
        private LocalDate firstCourseDate;
        private boolean firstCourse = true;
        private Staff staff;

        public StaffStudent(String name, String phoneNum, int age, double gpa, double salary) {
            super(name, phoneNum, age,gpa);
            staff = new Staff(name, phoneNum,age,salary );
        }

        public LocalDate getFirstCourseDate(){
            return firstCourseDate;
        }

        @Override
        public void addCourse(Course course){
            if(firstCourse == true){
                firstCourseDate = LocalDate.now();
                firstCourse = false;
            }
            super.addCourse(course);
        }

        public double getSalary(){
            return staff.getSalary();
        }
}
