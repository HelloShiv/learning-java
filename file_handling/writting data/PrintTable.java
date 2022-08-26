import java.io.*;
public class PrintTable {
    public static void main(String[] args) {
        final int a = 2;

        try{
        FileOutputStream fout = new FileOutputStream("Table",true);
        for(int i =1 ; i<=10;i++){
            int logic = a*i;
            String ammend = a + " * " + i +" = " ;
            fout.write(ammend.getBytes());
            fout.write(String.valueOf(logic).getBytes());
            fout.write((byte)'\n');
        }
        fout.close();

    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
