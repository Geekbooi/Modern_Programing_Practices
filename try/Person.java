package school_lab;

public class Person {
    private String name ;
    private int phone;
    private int age;

    public Person (String name, int phone, int age){
        this.name = name;
        this.phone = phone;
        this.age= age;
    }
    public void addCourse(Course c){
        if(this instanceof Faculty){
            Faculty fac = (Faculty) this;
            fac.addCourse(c);
        }
        if(this instanceof Student){
            Student stud = (Student) this;
            stud.addCourse(c);
        }
        if(this instanceof StaffStudent){
            StaffStudent stud = (StaffStudent) this;
            stud.addCourse(c);
        }
    }

    public int getPhone() {
        return phone;
    }

    public void setName(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary{
        return salary;
    }

    @Override
    public String toString() {
        return " {name: "+ name + ", phone number: "+ phoneNum + ", age: "+ age + ", type: "+ this.getClass().getSimpleName() + "} ";
    }

    public double getSalary() {
        double totSalary =0;
        if(this instanceof Faculty  ){
            Faculty faculty = (Faculty) this;
            totSalary+=faculty.getSalary();
        }else if( this.getClass().getSimpleName().equals("schoolLab2.Staff") ){
            Staff staff = (Staff) this;
            totSalary+=staff.getSalary();
        }else if( this.getClass().getSimpleName().equals("schoolLab2.StaffStudent") ){
            StaffStudent staffStudent = (StaffStudent) this;
            totSalary+=staffStudent.getSalary();
        }
        return totSalary;
    }

    public void unitsPerFaculty(){
        if(this instanceof Faculty){
            Faculty fac = (Faculty) this;
            fac.getTotalUnits();
        }
    }
}