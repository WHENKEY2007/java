public class ConstructorExample1{
    int id;
    String name;
    int age;
    
    ConstructorExample1(){
        System.out.println("Default Constructor");
    }
    ConstructorExample1(int a){
        id=a;
    }
    ConstructorExample1(int a,String s){
        id=a;
        name=s;
    }
    ConstructorExample1(int a,String s,int b){
        id=a;
        name=s;
        age=b;
    }
    void display(){
        System.out.println("id:"+id+" "+"Name:"+name+" "+"Age:"+age);
    }

    public static void main(String[] args){
        ConstructorExample1 obj1=new ConstructorExample1();
        ConstructorExample1 obj2=new ConstructorExample1(1);
        ConstructorExample1 obj3=new ConstructorExample1(2,"Ramesh");
        ConstructorExample1 obj4=new ConstructorExample1(3,"Suresh",18);

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}