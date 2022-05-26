// WAP and show Threading using Runnable and setPriority 
class demo implements Runnable {
    String name;
    Thread t;

    demo(String s,int a) {
        name = s;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        // Setting Priority
        t.setPriority(a);
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

public class SetPriorityMultiThreading {
    public static void main(String[] args) {
        new demo("One",5);
        new demo("Two",10);
        new demo("Three",1);

    }
}

// Default priority is 5
