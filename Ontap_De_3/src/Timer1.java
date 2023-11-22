import java.util.Scanner;

public class Timer1 extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Timer1: ");
                String str = sc.nextLine();
                synchronized (Main.lock) {
                    Main.c = str;
                    Main.check = true;
                }
                Thread.sleep(10);
            } while (!Main.c.equals("thoat"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
