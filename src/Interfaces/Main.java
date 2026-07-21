package Interfaces;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amput to see the tax per upu app");
        int n=sc.nextInt();
        UPI p=new PhonePe();
        UPI g=new Gpay();
        p.Tax(n);
        g.Tax(n);
    }
}
