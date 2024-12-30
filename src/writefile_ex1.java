import java.io.FileOutputStream;
import java.io.IOException;

public class writefile_ex1 {
    public static void main(String[] args) {
        String filename="one.jpeg";
        String content="welcome to tutorial point";
        try(FileOutputStream fos=new FileOutputStream(filename)) {
            byte[] bytes=content.getBytes();
            fos.write(bytes);
            System.out.println("content has been written to the file");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
