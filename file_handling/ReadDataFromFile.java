import java.io.*;

public class ReadDataFromFile  {
    public static void main(String[] args) throws Exception{
        FileReader freader = new FileReader("C:\\Users\\awdhe\\Desktop\\learning\\Java\\file_handling\\test.txt");
        try{
        int i;
        while(( i = freader.read())!= -1){
            System.out.print((char)i);
        }
    }
    finally{
        freader.close();
    }



    }
}
