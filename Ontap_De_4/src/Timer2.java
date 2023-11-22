public class Timer2 extends Thread {
    public int calFactorial(int input) {
        int result = 1;
        for (int i = 1; i <= input; i++) {
            result *= i;
        }
        return result;
    }
    @Override
    public void run() {
        try {
            do {
                synchronized (Main.lock) {
                    if (Main.check) {
                        System.out.println("Timer2: " + Main.n);
                        System.out.println("Factorial: " + calFactorial(Main.n));
                        Main.check = false;
                    }
                }
                Thread.sleep(10);
            } while (Main.n != 0);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
