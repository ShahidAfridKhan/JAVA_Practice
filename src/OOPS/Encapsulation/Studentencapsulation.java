package OOPS.Encapsulation;



class Studentt{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public void setage(int age){

        if(age>18){
            this.age=age;
        }else{
            System.out.println("Invalid age");
        }
    }

    public String getname(){
        return name;
    }

    public int getage(){

        return age;
    }
}

public class Studentencapsulation {
    public static void main(String[] args) {
        Studentt s=new Studentt();

        s.setage(20);
        System.out.println(s.getage());
    }
}
