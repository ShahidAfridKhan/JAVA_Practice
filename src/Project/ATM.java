package Project;
import java.util.*;
class Customer{
    long accnumber;
    String name;
    int age;
    double balance;
    double debit;
    Customer(long accnumber,String name,int age,double balance,double debit){
        this.accnumber=accnumber;
        this.name=name;
        this.age=age;
        this.balance=balance;
        this.debit=debit;
    }

    void withdraw(){
        if(balance < debit){
            System.out.println("Ayyo sir dengayandi");
        }
        if(balance >debit){
            double total=balance-debit;
            System.out.println("current balance: "+total);
        }
    }
    void slip(){
        System.out.println("----------------------------------");
        System.out.println("Acc: "+accnumber);
        System.out.println("User name: "+name);
        System.out.println("Age: "+age);
        System.out.println("balance: "+balance);
        System.out.println("debit: "+debit);
        System.out.println("After the debit: ");
        System.out.println("--------------------------------------");
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Account Number:");
        long accno = sc.nextLong();
        sc.nextLine();

        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Age:");
        int age = sc.nextInt();

        System.out.println("Money that you want:");
        double debit = sc.nextDouble();

        double balance = 9000;

        Customer c = new Customer(accno, name, age, balance, debit);
        c.withdraw();
        c.slip();
    }
}
