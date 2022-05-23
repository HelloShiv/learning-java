import java.io.*;
public class ReadFileInformation {

    public static void main(String[] args) throws Exception{
        File fobj = new File("C:\\Users\\awdhe\\Desktop\\learning\\Java\\file_handling\\test.txt");
        if(fobj.exists()){
            System.out.println("File Name:" + fobj.getName());
            System.out.println("File location: " + fobj.getAbsolutePath());
            System.out.println("File Writable: "+ fobj.canWrite());
            System.out.println("File Readable: "+ fobj.canRead());
            System.out.println("File Size: "+ fobj.length());
        }
        else {
            System.out.println("File does'nt exist ");
        }

    }
    
}
