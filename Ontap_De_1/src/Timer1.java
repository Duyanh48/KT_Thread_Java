import java.util.Scanner;

public class Timer1 extends Thread {
    @Override
    public void run() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Timer1: ");
            int num = sc.nextInt();
            main.c = num;
            main.check = true;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (main.c != 0);
    }
}