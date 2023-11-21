import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Timer1 extends Thread {
    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Start t1!");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"))) {
            do {
                System.out.print("Timer1: ");
                String s = sc.nextLine();
                synchronized (Main.lock) {
                    Main.str = s;
                    bw.write(s);
                    bw.newLine();
                    bw.flush();
                    Main.check = true;
                }
                Thread.sleep(1000);
            } while (!Main.str.equals("thoat"));
            System.out.println("End t1!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
