import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class fileread_ex3 {
    public static void main(String[] args) {
        String fileName="example4.txt";
        try {
            List<String> lines= Files.readAllLines(Paths.get(fileName));
            for(String line:lines)
            {
                System.out.print(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
