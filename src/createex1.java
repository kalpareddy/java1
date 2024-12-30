import java.io.File;

import java.io.File;
import java.io.IOException;

public class createex1 {
    public static void main(String[] args) throws IOException {
        String filename="example1.txt";
        File file=new File(filename);
        if (file.createNewFile())
        {
            System.out.println("file created successfully");
        }
        else
        {
            System.out.println("file already exist or failed to create");
        }
    }
}
