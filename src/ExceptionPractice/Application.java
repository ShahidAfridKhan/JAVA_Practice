package ExceptionPractice;
import java.util.*;
public class Application {

    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);

            int a=10;
            int b=0;

           // System.out.println(a/b);
            int c=sc.nextInt();
            if(c>0){
                System.out.println("yES");
            }
        }catch(Exception e){
            System.out.println("thi ownt possible");
        }
    }
}
