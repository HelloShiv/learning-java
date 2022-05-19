import java.io.*;
public class PrintTable {
    public static void main(String[] args) {
        final int a = 2;

        try{
        FileOutputStream fout = new FileOutputStream("Table");
        for(int i =1 ; i<=10;i++){
            int logic = a*i;
            String ammend = a + " * " + i +" = " ;
            fout.write(ammend.getBytes());
            fout.write(String.valueOf(logic).getBytes());
            fout.write((byte)'\n');
        }

    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
