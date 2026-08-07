package OOPS.Encapsulation;

class Car{
    public String name;
    private String  namee;
    protected String nam;


    public void setname(String namee){
        this.name=name;

    }

    public void getname(){
        System.out.println(name);
    }

}
/// Difference bw the private public and prtected
public class Example {
    public static void main(String[] args) {
        Car c = new Car();

        c.name="shaiid";

        c.setname("shaihd");
        c.getname();

    }
}
