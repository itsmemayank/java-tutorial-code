import java.io.OutputStream; // Abstract Class
import java.io.FileOutputStream; // Extends

public class OS {

    public static void main(String args[]) {
        String data = "This is a line of text inside the output.txt";

        try {
            OutputStream output = new FileOutputStream("Files/output.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            output.write(dataBytes);
            System.out.println("Data is written to the file.");

            // Closes the output stream
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

/*
    methods:
    write() - writes the specified byte to the output stream
    write(byte[] array) - writes the bytes from the specified array to the output stream
    flush() - forces to write all data present in output stream to the destination
    close() - closes the output stream
*/