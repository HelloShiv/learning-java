

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

 import javax.annotation.processing.Filer;

 public class FilterInput {
    public static void main(String[] args) throws Exception{
        
            FileInputStream fin = new FileInputStream("ABC.txt");
            FilterInputStream filterobj = new BufferedInputStream(fin);
            int k =0;
            while((k = filterobj.read())!=-1 ){
                System.out.print((char)k);
            }
            fin.close();
            filterobj.close();

        
    }
}
