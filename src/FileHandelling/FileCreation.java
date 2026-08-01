package FileHandelling;

import java.io.File;
import java.io.IOException;

public class FileCreation {
    public static void main(String[] args) throws IOException{
        File file=new File("notes.txt");

        if(file.createNewFile()){
            System.out.println("File Created");
        }else{
            System.out.println("Already Exists");
        }


    }
}
