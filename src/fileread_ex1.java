import java.io.FileReader;
import java.io.IOException;

public class fileread_ex1 {
    public static void main(String[] args) {
        String fileName="example4.txt";
        try(FileReader reader=new FileReader(fileName)) {
            int character;
            while ((character=reader.read())!=-1){
                System.out.print((char)character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
