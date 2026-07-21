package Instant;

public class Blinkit implements Partner{
    int orderid;
    String FoodName;
    double Distance;

    Blinkit(int orderid,String FoodName,double Distance){
        this.orderid=orderid;
        this.FoodName=FoodName;
        this.Distance=Distance;
    }

    public void statment(){
        System.out.println("Order Id: "+orderid);
        System.out.println("FoodName: "+FoodName);
        System.out.println("Distance Charge: 50");
    }
    public void order(int distance){
    }
    public void trackOrder(){
        System.out.println("Tracking........... "+orderid);
    }

    public void cancelOrder(){
        System.out.println("cancelled "+orderid);
    }

}
