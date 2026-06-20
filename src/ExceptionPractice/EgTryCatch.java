package ExceptionPractice;
class tryy{
    static void tryblockA() {
        try {
            int a = 1;
            int b = 0;

            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("no it wont work that why iam here");
        }
    }
}
public class EgTryCatch {

        public static void main(String args[]){
            int a=10;
            int b=0;
            //it wont run so we use the try catch for the maintain the application neact and clean
            // without the error
           // System.out.println(a/b);
/*
            try{
                System.out.println(a/b);
            }catch(Exception e){
                System.out.println("bro sorry this is error that can cause thats why we are useig the try catch");
            }

 */
            tryy.tryblockA();
        }
}
