import java.io.*;

public class PerformFileWriteOperation {
    public static void main(String[] args) throws Exception {
        
        FileWriter fWriter = new FileWriter("C:\\Users\\awdhe\\Desktop\\learning\\Java\\file_handling\\test.txt");
        try{
            fWriter.write("Java programming is ...");
        }
        finally{
            fWriter.close();
        }
        System.out.println("Successfully Data wrote in File");
    }
    
}
