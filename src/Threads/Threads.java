package Threads;

class Mythread extends Thread{
    public void run(){
        System.out.println("Running");
    }
}
public class Threads {
    public static void main(String[] args) {
        Mythread t=new Mythread();

        t.run();
    }
}
