import java.io.FileOutputStream;

public class FOS {
    public static void main(String[] args) {
        
        String data = "This is a line of text inside the output.txt";

        try {
            // true=append, false=overwrites
            FileOutputStream output = new FileOutputStream("Files/output.txt",false); 

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            // Close() method
            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}