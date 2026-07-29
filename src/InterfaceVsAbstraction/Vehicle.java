package InterfaceVsAbstraction;

abstract class Vehicle {
    abstract void start();

    void fuelType(){
        System.out.println("This vehicle needs Fuel");
    }
}

class car extends Vehicle{
    void start(){
        System.out.println("car starts with a key");
    }
}
class bike extends Vehicle{
    void start(){
        System.out.println("Bike starts with a kick");
    }
}

class main{
    public static void main(String[] args) {
        Vehicle v1=new car();

        Vehicle v2=new bike();

        v1.start();
        v2.start();
    }
}