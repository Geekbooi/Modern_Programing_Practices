package lab3_1_HR_application;

public class Main {
    public static void main(String[] args) {
        Position ceo =new Position("CEO", "Chief Executive Officer");
        Position senior = new Position("Senior", "Managing the Junior");
        Position junior  = new Position("Junior", "Routine work");

        Employee emp1  = new Employee("23", "Soghr ","W","jynhbgf",7656,50000);
        Employee emp2  = new Employee("23", "Soghr ","W","jynhbgf",7656,50000);
        ceo.addEmployee(emp1);

        Department CSDepartment = new Department("classroom", "Verill-Hall" ) ;
        Department AccountingDepartment = new Department("Registration", "R-20");

        Company C = new Company("Maharishi International University");
        C.addDepartments(CSDepartment);
        C.addDepartments(AccountingDepartment);



        CSDepartment.addPosition(ceo);
        CSDepartment.addPosition(junior);
        CSDepartment.addPosition(senior);

        //senior.addEmployee(hs);

        if(emp1 == emp2)
            System.out.println("both employee objects are the same");

        C.print();
        C.getSalary();
    }
}
