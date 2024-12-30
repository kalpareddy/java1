class t1 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("BCA COLLEGE sharnbasva university");
            System.out.println("location gulbarga");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {

            }

        }
    }
}
class t2 extends Thread {
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("PUC COLLEGE name: CPM");
                System.out.println("location gulbarga");
                try {
                    Thread.sleep(1000);
                }
                catch (Exception e) {

                }

            }
        }
}
class t3 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("school VJVM");
            System.out.println("location gulbarga");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }

        }
    }
}
public class multithreading2 {
                public static void main(String[] args){
                t1 obj1=new t1();
                t2 obj2=new t2();
                t3 obj3=new t3();
                obj1.start();
                obj2.start();
                obj3.start();
                }
}
