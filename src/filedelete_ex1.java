import java.io.File;

public class filedelete_ex1 {
    public static void main(String[] args) {
        File file =new File("example3");
        if(file.exists()){
            if (file.delete()){
                System.out.println("file deleted");
            }
            else {
                System.out.println("failed to delete");
            }
        }else {
            System.out.println("file does not exist");
        }
    }
}
