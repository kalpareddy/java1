import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class createfile3
{
    public static void main(String[] args) {
        String filename="example3.txt";
        try {
            Files.write(Paths.get(filename),("hello").getBytes());
            System.out.println("file created");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
