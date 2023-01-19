package lab3_1_HR_application;

public class Main {
    public static void main(String[] args) {
        Department CSDepartment = new Department("classroom", "Verill-Hall" ) ;
        Department AccountingDepartment = new Department("Registration", "R-20");

        Position ceo =new Position("CEO", "Chief Executive Officer");
        Position senior = new Position("Senior", "Managing the Junior");
        Position junior  = new Position("Junior", "Routine work");

        Employee hs  = new Employee("23", "Soghr ","W","jynhbgf",7656,5);

        ceo.addEmployee(hs);
        senior.addEmployee(hs);

        CSDepartment.addPosition(ceo);
        CSDepartment.addPosition(junior);
        CSDepartment.addPosition(senior);

        Company C = new Company("Maharishi International University");
        C.addDepartments(CSDepartment);
        C.addDepartments(AccountingDepartment);

        C.print();
        C.getSalary();
    }
}
