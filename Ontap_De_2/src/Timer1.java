import java.util.Scanner;

public class Timer1 extends Thread {
    @Override
    public void run() {
        System.out.println("Start t1!");
        Scanner sc = new Scanner(System.in);
        try {
            do {
                System.out.print("Timer1: ");
                String str = sc.nextLine();
                synchronized (Main.lock) {
                    Main.s = str;
                    Main.check = true;
                }
                Thread.sleep(10);
            } while (!Main.s.equals("thoat"));
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("End t1!");
    }
}
