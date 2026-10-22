public class ThreadByRunnable {
    public static void main(String[] args) {
        Thread goodMorningThread = new Thread(new GoodMorningRunnable());
        Thread helloThread = new Thread(new HelloRunnable());
        Thread welcomeThread = new Thread(new WelcomeRunnable());

        goodMorningThread.start();
        helloThread.start();
        welcomeThread.start();
    }
}

class GoodMorningRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Good Morning runnable interrupted");
                break;
            }
        }
    }
}

class HelloRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Hello runnable interrupted");
                break;
            }
        }
    }
}

class WelcomeRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Welcome runnable interrupted");
                break;
            }
        }
    }
}
