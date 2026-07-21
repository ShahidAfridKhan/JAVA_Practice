package Instant;

public class Zomato implements Partner{
    int orderid;
    String FoodName;
    double Distance;

    Zomato(int orderid,String FoodName,double Distance){
        this.orderid=orderid;
        this.FoodName=FoodName;
        this.Distance=Distance;
    }
    public void statment(){
        System.out.println("Order Id: "+orderid);
        System.out.println("FoodName: "+FoodName);
        System.out.println("Distance Charge: "+Distance*10);
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
