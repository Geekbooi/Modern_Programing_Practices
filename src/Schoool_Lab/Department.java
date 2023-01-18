package Schoool_Lab;

import java.util.ArrayList;

public class Department {
    private String name;
    lab ArrayList<Person> myPerson;

    public Department(String name) {
        this.name = name;
        myPerson = new ArrayList<Person>();
    }

    public String getName() {
        return Name;
    }

    public double getTotalSalary() {
        double total = 0;
        for (Person p : myPerson) {
            if (p instanceof Faculty || p instanceof Staff) {
                total += p.getSalary();
            }
        }
        return total;
    }
//    public double getTotalSalary(){
//    double total = 0;
//        for (Stuff p : myPerson) {
//        if (p instanceof Staff) {
//            total += p.getSalary();
//        }
//    }
//        return total;
//}

    public void showAllMembers(){
        for (Person p : myPerson) {
            if (p instanceof Faculty) {
                Faculty f = (Faculty)p;
                System.out.println("Name: " + f.getName());
                System.out.println("Units taught: " + f.getUnits());
            }
        }

    }
    public void unitsPerFaculty() {
        for (Faculty f : faculty) {
            int units = 0;
            for (Course c : f.getCourses()) {
                units += c.getUnits();
            }
            System.out.println(f.getName() + " " + units);
        }
    }
        public void showAllMembers() {
            for (Member m : members) {
                System.out.println(m.getName() + " " + m.getPhoneNumber() + " " + m.getAge() + " " + m.getType());
            }
        }

        public void studentsPerFaculty(String facultyName) {
            ArrayList<String> studentNames = new ArrayList<String>();
            for (Faculty f : faculty) {
                if (f.getName().equals(facultyName)) {
                    for (Course c : f.getCourses()) {
                        for (Student s : c.getStudents()) {
                            studentNames.add(s.getName());
                        }
                    }
                }
            }
            System.out.println(studentNames);
        }
    }

}
