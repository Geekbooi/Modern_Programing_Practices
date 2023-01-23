package OverridingToString;

public class Person {
    private String name;
    Person(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this != obj)
            return false;
        if(obj == null)
            return false;
        if(!(obj instanceof Person))
            return false;
        Person p = (Person)obj;
        return this.getName().equals(p.getName());
    }
}
