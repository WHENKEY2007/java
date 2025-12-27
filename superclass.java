class Person{
    String name="Suresh";
    void show()
    {
        System.out.println("Iam a Person");
    }
}
class Student extends Person{
    String name="Pavan";
    void show()
    {
        System.out.println("Iam a student");
    }
    void display()
    {
        System.out.println("Name from child class:"+name);
        //super()-->constructors
        //super.variableName-->variables from parent class
        System.out.println("Name from Parent class:"+super.name);
        show();
        //super.methodName()-->to call superclass methods
        super.show();
    }
}
public class Inheritance2 {
    public static void main(String args[]) {
       Student s=new Student();
       s.display();
    }
}