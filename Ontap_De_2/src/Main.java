public class Main {
    public static String s = "";
    public static Boolean check = false;
    public static Object lock = new Object();
    public static void main(String[] args) {
        try {
            Timer1 t1 = new Timer1();
            t1.start();

            Timer2 t2 = new Timer2();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("This is main-Thread");
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
    }
}
