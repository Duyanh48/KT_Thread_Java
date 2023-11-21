public class main {
    public static int c = 1;
    public static Boolean check = false;
    public static void main(String[] args) {
        try {
            Timer1 t1 = new Timer1();
            Timer2 t2 = new Timer2();

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("This is main thread!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}