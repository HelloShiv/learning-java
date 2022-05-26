// WAP and show Threading using Runnable
class demo implements Runnable {
    String name;
    Thread t;

    demo(String s) {
        name = s;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 2; i <= 20; i += 2) {
                System.out.print(i + " ");
                Thread.sleep(500);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\nExisting thread: " + name);
    }
}

public class ThreadRunnable {
    public static void main(String[] args) {
        new demo("One");
        new demo("Two");
        new demo("Three");

    }
}

// Total number of thread are four as we have three demo one,two,three and then
// main