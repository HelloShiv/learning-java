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
       demo d1 = new demo("One",5);
       demo d2 = new demo("Two",10);
       demo d3 = new demo("Three",1);
       demo d4 = new demo ("Four", Thread.MIN_PRIORITY);
       demo d5 = new demo("Five", Thread.MAX_PRIORITY);
       demo d6 = new demo("six", Thread.NORM_PRIORITY);
        try{d1.t.join();
        d2.t.join();
        d3.t.join();
        d4.t.join();
        d5.t.join();
        d6.t.join();
        } catch(Exception e){}

    }
}

// Default priority is 5
