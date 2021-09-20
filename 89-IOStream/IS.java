import java.io.InputStream; // Abstract Class
import java.io.FileInputStream; // Extends

public class IS {
    public static void main(String args[]) {

        byte[] array = new byte[100];

        try {
            InputStream input = new FileInputStream("Files/input.txt");

            System.out.println("Available bytes in the file: " + input.available());

            // Read byte from the input stream
            input.read(array);
            System.out.println("Data read from the file: ");

            // Convert byte array into string
            String data = new String(array);
            System.out.println(data);

            // Close the input stream
            input.close();
        }
        catch (Exception e) {
            System.out.println("File Not Found.");;
        }
    }
}

/*
    methods:
    read() - reads one byte of data from the input stream
    read(byte[] array) - reads bytes from the stream and stores in the specified array
    available() - returns the number of bytes available in the input stream
    mark() - marks the position in the input stream up to which data has been read
    reset() - returns the control to the point in the stream where the mark was set
    markSupported() - checks if the mark() and reset() method is supported in the stream
    skips() - skips and discards the specified number of bytes from the input stream
    close() - closes the input stream
*/