class c1 implements Runnable
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
}class c2 implements Runnable
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
public class multithreadinginterface {
    public static void main(String[] args){
        hai obj1=new hai();
        hello obj2=new hello();
        Thread c1=new Thread(obj1);
        Thread c2=new Thread(obj2);

        c1.start();
        c2.start();

    }
}
