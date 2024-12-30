import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class writefile_ex {
    public static void main(String[] args) {
        String filename = "example4.txt";
        File file = new File(filename);
        try {
            if (file.createNewFile()) {
                System.out.println("file created successfully");
            } else {
                System.out.println("file already exist or failed to create");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("hello");
            writer.write(" kalpana");
            System.out.println("content written to the file");
            writer.close();
        } catch (IOException e) {
            System.out.println(e);

        }
    }
}
