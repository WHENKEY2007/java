class Student{
    int roll;
    String name;
    String branch;

    void canread(){
        System.out.println("I can Read");
    }
    void canwrite(){
        System.out.println("I can write");
    }
    
    void display(){
        System.out.println("Rollnumber: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Class: "+branch);
    }
}

    public class Student_Class{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.roll=304;
        s1.name="SV";
        s1.branch="AIML";
        s1.display();
        s1.canread();
        s1.canwrite();
    }

}


