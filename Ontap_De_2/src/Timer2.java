import java.util.Arrays;

public class Timer2 extends Thread {
    public String reverseString(String input) {
        return new StringBuffer(input).reverse().toString();
    }
    @Override
    public void run() {
        System.out.println("Start t2!");
        try {
            do {
                synchronized (Main.lock) {
                    if(Main.check) {
                        System.out.println("Timer2: " + Main.s);
                        System.out.println("Reverse String: " + reverseString(Main.s));
                        Main.check = false;
                    }
                }
                Thread.sleep(10);
            } while (!Main.s.equals("thoat"));
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("End t2!");
    }
}
