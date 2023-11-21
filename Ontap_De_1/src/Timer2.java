public class Timer2 extends Thread {
    public boolean isPrime (int n) {
        if (n <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public void run() {
        do {
            if(main.check) {
                if (isPrime(main.c)) {
                    System.out.println(main.c + " là số nguyên tố!");
                } else {
                    System.out.println(main.c + " không phải là số nguyên tố!");
                }
                main.check = false;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (main.c != 0);
    }
}