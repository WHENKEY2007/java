public class ConstructorExample1{
    int id;
    String name;
    int age;
    
    ConstructorExample1(){
        System.out.println("Default Constructor");
    }
    ConstructorExample1(int a,String s){
        id=a;
        name=s;
    }
    void display(){
        System.out.println("id: "+id+"Name: "+name+"Age: "+age);
    }

    public static void main(String[] args){
        ConstructorExample1 obj1=new ConstructorExample1();
        ConstructorExample1 obj2=new ConstructorExample1(1,"Suresh");
        obj1.display();
        obj2.display();
    }
}