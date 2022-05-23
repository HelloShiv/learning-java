//WAP to implement filter output and file output

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.*;

public class filter {
    public static void main(String[] args) throws Exception{
        FileOutputStream file = new FileOutputStream("ABC.txt");
        FilterOutputStream filter = new FilterOutputStream(file);
        String s = "Welcome JECRCU";
        filter.write(s.getBytes());
        filter.flush(); // to clean buffer memory as data is first transfered from stream to buffer memory and then wrote in the file
        filter.close();
        file.close();

    }
    
}
