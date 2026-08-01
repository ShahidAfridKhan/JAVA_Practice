package FileHandelling;
import java.io.File;
import java.io.IOException;
public class DeletingFile {
    public static void main(String[] args) {
        File file=new File("notes.txt");

        if(file.delete()){
            System.out.println("Deleted");
        }else{
            System.out.println("Not Found");
        }
    }
}
