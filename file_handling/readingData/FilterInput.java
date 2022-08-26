import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

 import javax.annotation.processing.Filer;

 public class FilterInput {
    public static void main(String[] args) throws Exception{

            int a =20;
            System.out.printf("%d", a);
            // mention the data type when using printf as it is C style for language
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
