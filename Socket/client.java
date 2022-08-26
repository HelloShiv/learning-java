import java.io.*;
import java.net.*;
import java.util.Scanner;

public class client {
    public static void main(String[] args) throws Exception {
        
        Socket s = new Socket("localhost",9999);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        while(true){
            String ao = scan.next();
            dout.writeUTF(ao);
            if(ao.equalsIgnoreCase("exit"))
                break;
        }
    s.close();
    }
}
