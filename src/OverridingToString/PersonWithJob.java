package OverridingToString;

public class PersonWithJob extends Person{
    private double Salary;
    PersonWithJob(String name, double Salary) {
        super(name);
        this.Salary=Salary;
    }
    public double getSalary(){
        return Salary;
    }

    public boolean equals(Object aPerson){
        if(aPerson ==null) return false;
        if(!(aPerson instanceof PersonWithJob)) return false;
        PersonWithJob perwith = (PersonWithJob) aPerson;
        return this.getName().equals(perwith.getName()) && this.getSalary()== perwith.getSalary();

    }

    public static void main(String[] args) {
        Person p1 = new Person("Bob");
        Person p2 = new PersonWithJob("Bob", 3000);

        System.out.println("p1 is equals with p2 - " + p1.equals(p2));
        System.out.println("p1 is equals with p2 - " + p2.equals(p1));

    }
}
