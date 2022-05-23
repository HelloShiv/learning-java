import java.io.FileOutputStream;
import java.io.IOException;

class writingdifferentdatatype {
    public static void main(String[] args) {
        try {
            char sec = 'G';
            String name = "Swagat Swaroop Parida";
            int age = 25;
            FileOutputStream fout = new FileOutputStream("something.txt");
            fout.write((byte) sec + (byte)'\n');
            fout.write((byte) '\n');
            
            fout.write((byte) '\n');
            fout.write(name.getBytes());
            fout.write((byte) '\n');
            byte[] hell = name.getBytes();
            String Sage = String.valueOf(age);
            // fout.write(Sage.getBytes());
            // To write integer directly you need to first convert integer into String by String.valuOf(int_variable) then write or convert directly into byte
            // Or directly convert it like this
            fout.write(String.valueOf(age).getBytes());

        } catch (IOException e) {
            System.out.print(e);
        }
    }
}