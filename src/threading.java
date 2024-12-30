class hai extends Thread
{
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println("inside hai");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            }

        }
    }
}class hello extends Thread
{
    public void run()
    {
        for (int i = 0; i < 4; i++) {
            System.out.println("inside hello");
            try {
                Thread.sleep(500);
            }
            catch (Exception e){

            }

        }
    }
}
public class threading {
    public static void main(String[] args){
        hai obj1=new hai();
        hello obj2=new hello();
        obj1.start();
        obj2.start();

    }
}
