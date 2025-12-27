class Person {
    String name;
    Person(String name) {
        this.name = name;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, int empId) {  
        super(name);     //call a super class constructor   
        this.empId = empId;
    }

    void displayEmployee() {
        System.out.println("EmpId: " + empId);
        System.out.println("I am an Employee");
    }
}

class Manager extends Employee {

    Manager(String name, int empId) {
        super(name, empId);   
    }

    void manage() {
        System.out.println("I am a manager");
    }
}

public class Inheritance2 {
    public static void main(String args[]) {

        Person p = new Person("Saikala");
        p.displayPerson();

        Employee e = new Employee("Saikala", 1);
        e.displayEmployee();

        Manager m = new Manager("Saikala", 101);
        m.manage();
    }
}