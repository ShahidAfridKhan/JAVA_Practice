package OOPS.Encapsulation;


class test{
    String name;
    int age;
/*
    test(String name,int age){
        this.name=name;
        this.age=age;
    }

 */
}


public class Student {
    public static void main(String[] args) {
        test t=new test();

        t.name="Shaid";
        t.age=20;

        System.out.println("Name: "+t.name);
        System.out.println("Name: "+t.age);


    }
}



