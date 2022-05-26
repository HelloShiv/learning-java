// WAP to implement mutlithreading by inheriting Thread 
class demo extends Thread{
    demo(){
        super("Super Thread");
        System.out.println("Demo thread" + this);
        start(); // As we are inheriting the class we directly called the member function no need to create object.
    }
    public void run(){
        try{
            for(int i = 2 ; i <= 20; i+=2){
                System.out.println("demo class "+ i);
                Thread.sleep(500);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}
class ThreadingUsingInheritance {
    public static void main(String[] args) {
        new demo();
        try{
            for(int i = 5; i>=1 ;i--){
                System.out.println("Main class " + i );
                Thread.sleep(1000);

            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("end");
    }
}