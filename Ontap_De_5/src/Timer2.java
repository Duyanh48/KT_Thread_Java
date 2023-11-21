import java.io.BufferedReader;
import java.io.FileReader;

public class Timer2 extends Thread {
    @Override
    public void run() {
        System.out.println("Start t2!");
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            do {
                synchronized (Main.lock) {
                    if (Main.check) {
                        String s = br.readLine();
                        System.out.println("Timer2: " + s);
                        Main.check = false;
                    }
                }
            } while (!Main.str.equals("thoat"));
            System.out.println("End t2!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
