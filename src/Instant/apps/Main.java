package Instant.apps;

import Instant.Partner;
import Instant.house.Restaurant;

public class Main {
    public static void main(String[] args) {
        Partner S=new Swiggy(101,"Biryani",10);
        Partner Z=new Zomato(102,"Dosa",10);
        Partner B=new Blinkit(103,"Mutton Curry",15);

        System.out.println("---------------------------------------");
        S.statment();
        S.order(10);
        S.trackOrder();
        S.cancelOrder();
        Restaurant.showMenu();
        Restaurant.prepareFood();
        System.out.println("---------------------------------------");
        Z.statment();
        Z.order(10);
        Z.trackOrder();
        Z.cancelOrder();
        System.out.println("---------------------------------------");
        B.statment();
        B.order(10);
        B.trackOrder();
        B.cancelOrder();
    }
}
