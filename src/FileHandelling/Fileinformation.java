package FileHandelling;
import java.io.File;
import java.io.IOException;
public class Fileinformation {
    public static void main(String[] args) {
        File file=new File("notes.txt");

        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());

        System.out.println(file.length());
        System.out.println(file.canRead());


    }
}
