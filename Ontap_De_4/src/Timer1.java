import java.util.Scanner;

public class Timer1 extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Timer1: ");
                int a = sc.nextInt();
                while (a < 0 || a > 20) {
                    System.out.print("Please re-enter: ");
                    a = sc.nextInt();
                }
                synchronized (Main.lock) {
                    Main.n = a;
                    Main.check = true;
                }
                Thread.sleep(10);
            } while (Main.n != 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
