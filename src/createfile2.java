import java.io.FileOutputStream;
import java.io.IOException;

public class createfile2 {
    public static void main(String[] args) {
        String filename="example2.txt";
        try(FileOutputStream fos=new FileOutputStream(filename))
        {
            System.out.println("file created successfully");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
