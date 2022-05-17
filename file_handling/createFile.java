import java.io.*;

class createFile  {
    public static void main(String[] args) throws Exception{
        File f = new File("C:\\Users\\awdhe\\Desktop\\learning\\Java\\file_handling\\test.txt");
       try{
        if(f.createNewFile()){
            System.out.print("File Scuccessfully Createdd... ");
        }
        else{
            System.out.print("File already exist");
        }
     }
     catch(Exception except){
         System.out.print("Error ocured \n"+ except);
     }
       
    
    
}
