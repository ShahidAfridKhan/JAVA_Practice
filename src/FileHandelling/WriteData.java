package FileHandelling;
import java.io.FileWriter;
import java.io.IOException;
public class WriteData {
    public static void main(String[] args) throws IOException{

        FileWriter writer=new FileWriter("notes.txt");

        writer.write("Java\n");
        writer.write("shaid\n");
        writer.write("Shahid Afid Khan\n");

        writer.write("My name is the Shahid Afrid Khan and i am from the Lovely Professional University and iam from the Tenali District and aim proper belonds to the TRenlai");

        writer.close();

        System.out.println("Data Saved");
    }
}
