// WAP to implemet isAlive() and join() multithreading
class demo implements Runnable{
    String name;
    Thread t;
    demo(String s){
        name =  s ; 
        t =  new Thread(this,name);
        System.out.println("demo thread: " + t);
        t.start();
    }
    public void run(){
        try{
            t.sleep(500);
            for(int i =2 ;i<=20;i=i+2){
                System.out.print(i+" ");
                t.sleep(500);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of demo: " + name);
    }
}

class IsAlive {
    public static void main(String[] args) {
        demo d1 = new demo("One");
        demo d2 = new demo("Two");
        demo d3 = new demo("Three");
        System.out.println("One is alive :" + d1.t.isAlive());
        System.out.println("Two is alive :" + d2.t.isAlive());
        System.out.println("Three is alive :" + d3.t.isAlive());

       try{
           d1.t.join();
           d2.t.join();
           d3.t.join();
       } catch(Exception e){ System.out.println(e);}
       System.out.println("End of the program reached");
    }
}
