import java.io.*;
import java.util.Scanner;
class AddTwoNumber{
	public static void main(String[] args) throws Exception{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter one Number: ");
	int num1 = scan.nextInt();
	
	FileOutputStream fout = new FileOutputStream("something.txt");

	int num2 = Integer.parseInt(args[0]);
	int sum = num1 + num2;
	fout.write(sum);
	System.out.print(sum);
	fout.close();
	
	}
}