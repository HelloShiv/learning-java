// we can use the thread as object or directly extend the class this is called thread class
// Using interface as thread

public class ThreadingDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        t.setName("My Thread");
        System.out.println("Thread name: "  + t.getName());
        System.out.println("After name change: " + t);

        try{
            for(int n=5; n>0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e){
            System.out.println("Main thread iterrupted");
        }
        finally{
            System.out.println("End of the program reached");
        }
        
    }
}
