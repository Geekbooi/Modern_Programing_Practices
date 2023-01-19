package school_lab;

import java.util.ArrayList;

public class Department {
    private String name;
    private Scanner input;
    ArrayList<Person> myPerson;

    public Department(String name) {
        this.name = name;
        myPerson = new ArrayList<Person>();
    }

    public void addPerson(Person per) {
        myPerson.add(per);
    }

    public String getName() {
        return Name;
    }

    public double getTotalSalary() {
        double totSalary = 0;
        for (Person p : myPerson) {
            if (p instanceof Faculty || p instanceof Staff) {
                totSalary += p.getSalary();
            }
        }
        return totSalary;
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

    public void showAllMembers() {
        persons.stream().forEach(System.out::println);
    }

//        for (Person p : myPerson) {
//            if (p instanceof Faculty) {
//                Faculty f = (Faculty)p;
//                System.out.println("Name: " + f.getName());
//                System.out.println("Units taught: " + f.getUnits());
//            }
//        }

    public void unitsPerFaculty() {
        for (Person p: persons) {
            if(p.getClass().getSimpleName().equals("schoolLab2.Faculty")){
                Faculty faculty = (Faculty)p;
                faculty.getTotalUnits();
            }
        }
    }
        public void showAllMembers() {
            for (Member m : members) {
                System.out.println(m.getName() + " " + m.getPhoneNumber() + " " + m.getAge() + " " + m.getType());
            }
        }


    public void facultyStudents() {
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        System.out.println("Enter Faculty name");
        input = new Scanner(System.in);
        String name = input.nextLine();


        for (Person person : persons) {
            if (person instanceof Faculty) {
                Faculty faculty = (Faculty) person;
                if (name.equals(faculty.getName())) {
                    courses = faculty.getCourses();
                }
            }
        }

        for (Person person : persons) {
            if (person instanceof Student) {

                Student student = (Student) person;
                List<Course> studentCourses = student.courses();
                for (Course course : studentCourses) {
                    if (courses.contains(course)) {
                        students.add(student);

                    }
                }
            }
        }
        students.stream().forEach(System.out::println);
    }
}

