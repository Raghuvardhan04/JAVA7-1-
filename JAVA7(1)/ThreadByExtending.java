public class ThreadByExtending {
    public static void main(String[] args) {
        GoodMorningThread goodMorningThread = new GoodMorningThread();
        HelloThread helloThread = new HelloThread();
        WelcomeThread welcomeThread = new WelcomeThread();

        goodMorningThread.start();
        helloThread.start();
        welcomeThread.start();
    }
}

class GoodMorningThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Good Morning thread interrupted");
                break;
            }
        }
    }
}

class HelloThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Hello thread interrupted");
                break;
            }
        }
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Welcome thread interrupted");
                break;
            }
        }
    }
}
