package Patterns_Program;/*
public class Number_increasing_Pyramid_Pattern {
    public static void main (String args[]) {
        int n = 5;
        printPattern(n);
    }
    public static void printPattern (int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}*/
public class MyRunnable extends Thread {
    @Override
    public void run() {
        // Code to be executed when the thread is started
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object and pass the MyRunnable instance to it
        Thread thread = new Thread(myRunnable);

        // Start the thread
        thread.start();

        // You can also start multiple threads with different MyRunnable instances if needed.
    }
}
