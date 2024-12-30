import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class fileread_ex2 {
    public static void main(String[] args) {
        String fileName="example4.txt";
        try(FileInputStream fis=new FileInputStream(fileName) ) {
            int byteValue;
            while ((byteValue=fis.read())!=-1){
                System.out.print((char)byteValue);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
