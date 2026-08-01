package FileHandelling;
import java.io.File;

import java.io.IOException;
public class ChectFile {
    public static void main(String[] args) {
        File file=new File("notes.txt");

        if(file.exists()){
            System.out.println("Exitsts");
        }
    }
}
