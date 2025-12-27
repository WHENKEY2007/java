class Animal{
    void eat()
    {
        System.out.println("Animal can eat");
    }
    void makeSound(){
        System.out.println("Animal can make sound");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }

}
public class Inheritance1{
    public static void main(String[] args){
        Dog obj1=new Dog();
        Animal obj2=new Animal();
        obj2.eat();
        obj2.makeSound();
        obj1.eat();
        obj1.makeSound();
        obj1.bark();
    }
}