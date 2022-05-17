import java.io.*;

public class PerformBufferedWriter  {
    public static void main(String[] args) throws Exception {
        
        FileWriter writer = new FileWriter("C:\\Users\\awdhe\\Desktop\\learning\\Java\\file_handling\\test.txt");  
        BufferedWriter fWriter = new BufferedWriter(writer);
        try{
            fWriter.write("Java programming is ...");
        }
        finally{
            
            fWriter.close();
        }
        System.out.println("Successfully Data wrote in File");
    }
    
}

