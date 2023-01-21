package lab3_1_HR_application;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Position> positions;
    private Company company;
    public Department(String name, String location) {
        this.name = name;
        this.location = location;

        positions = new ArrayList<>();
    }
    public void Print(){
        System.out.println("Department is "+ this.name);
        for(Position p : positions){
            p.print();
        }
    }
    public void addPosition(Position p ){
        positions.add(p);
    }

    public double getSalary(){
        double total = 0;
        for(Position P : positions) {
            total+=P.getSalary();
        }
        return total;
    }
}


