package Inheritance;

class Parent{
    public void hi(){
        System.out.println("Yela unnav");
    }
}
class Child extends Parent{
    public void hii(){
        System.out.println("nenu child nii raa");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();

        c.hi();
    }
}
