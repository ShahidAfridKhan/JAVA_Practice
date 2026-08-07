package Inheritance;
class Animals{
    public void Eating(){
        System.out.println("Eating..........");
    }
}
class Dog extends Animals{}
class Cat extends Animals{}

public class Animal {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Eating();

        Cat c=new Cat();
        c.Eating();
    }
}
