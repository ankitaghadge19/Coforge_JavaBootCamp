package MultiThreading;
import java.util.Scanner;

class PrintMessage extends Thread {
    private String message;
    private int startIndex;
    private static Object lock = new Object();

    public PrintMessage(String message, int startIndex) {
        this.message = message;
        this.startIndex = startIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < message.length(); i += 2) {
            synchronized (lock) {
                System.out.print(message.charAt(i));
                lock.notify(); // Notify the other thread
                try {
                    if (i + 1 < message.length()) {
                        lock.wait(); // Wait for the other thread
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class PrintStringUsingTwoThreadSynchronization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        String message = "Hello " + name + "!";

        PrintMessage t1 = new PrintMessage(message, 0);
        PrintMessage t2 = new PrintMessage(message, 1);

        t1.start();
        t2.start();
    }
}
