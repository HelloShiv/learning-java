public class WrapperClass {
    public static void main(String[] args){
        int x =32;
        Integer y = Integer.valueOf("23");
        int copy = y.intValue();
        System.out.println(x+"\n"+y);
        System.out.println(y.getClass().getSimpleName());
        System.out.println("Copy: "+ copy);
      
    }
}
