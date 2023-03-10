package MidExam.Practice_1.practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Student extends Person{
    double GPA;
    final List<Course> Courses;
    public Student(String name, String phone, int age, double GPA) {
        super(name, phone, age);
        this.GPA = GPA;
        Courses = new ArrayList<>();
    }
    public List<Course> getCourses() {
        return Courses;
    }

    @Override
    public void addCourse(Course c)
    {
        Courses.add(c);
    }
    @Override
    public int getTotalUnits(){
        return 3;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
