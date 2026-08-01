package FileHandelling;
import java.io.FileWriter;
import java.io.IOException;
public class AppendFile {
    public static void main(String[] args) throws IOException{

        FileWriter writer=new FileWriter("notes.txt",true);

        writer.write("Hibernate");

        writer.close();
    }
}
