import java.io.FileOutputStream;
import java.util.Scanner;

public class sir {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter  Number: ");
        String name = scan.next();

        FileOutputStream fout = new FileOutputStream("something.txt");

        byte[] something1 = name.getBytes();

        fout.write(something1);

        fout.close();

    }
}
