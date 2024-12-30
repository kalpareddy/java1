import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class writefile_ex2 {
    public static void main(String[] args) {
        String filename="example6.txt";
        String content="hey kalpana";
        try
        {
            Files.write(Paths.get(filename),content.getBytes());
            System.out.println("file written ");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
