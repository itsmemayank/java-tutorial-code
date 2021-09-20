import java.io.FileInputStream;

public class FIS {

  public static void main(String args[]) {

     try {
        FileInputStream input = new FileInputStream("Files/input.txt");

        System.out.println("Available bytes at the beginning: " + input.available());

        System.out.println("Data in the file: ");

        // Reads the first byte
        int i = input.read();

       while(i != -1) {
           System.out.print((char)i);

           // Reads next byte from the file
           i = input.read();
        }
        
        System.out.println();
        System.out.println("Available bytes at the end: " + input.available());
        
        // close() method
        input.close();
     }

     catch(Exception e) {
        e.getStackTrace();
     }
  }
}