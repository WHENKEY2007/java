class ConstructorExample1 {
    int id;
    String name;
    int age;
    String branch;
    String phno;
    ConstructorExample1(){

    }
    ConstructorExample1(int id ){
        this.id = id;
    }
    ConstructorExample1(int id , String name ){
        this.id = id;
        this.name = name;
    }
    ConstructorExample1(int id , String name , int age ){
        this(id,name);
        this.age = age;
    }
    ConstructorExample1(int id , String name , int age , String phno){
        this(id,name,age);
        this.phno = phno;
    }
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
        System.out.println("Phone: " + phno);
    }
    public static void main(String args[]){
        ConstructorExample1 obj1 = new ConstructorExample1();
        ConstructorExample1 obj2 = new ConstructorExample1(143 , "Maniiii");
        ConstructorExample1 obj3 = new ConstructorExample1(2,"xyz");
        ConstructorExample1 obj4 = new ConstructorExample1(3 , "nagayndra",69);
        ConstructorExample1 obj5 = new ConstructorExample1(4 ,"bob",51,"9191919");
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
    }
}