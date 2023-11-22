public class Timer2 extends Thread {
    public int countWord(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
    @Override
    public void run() {
        try {
            do {
                synchronized (Main.lock) {
                    if(Main.check) {
                        System.out.println("Timer2: " + Main.c);
                        System.out.println("Count: " + countWord(Main.c));
                        Main.check = false;
                    }
                }
                Thread.sleep(10);
            } while (!Main.c.equals("thoat"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
