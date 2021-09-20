// During the write operation, the bytes are written to the internal buffer instead of the disk. 
// Once the buffer is filled or the stream is closed, the whole buffer is written to the disk.
// This is why writing bytes is faster using BufferedOutputStream.

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class BufferedOutput {
    public static void main(String[] args) {

        String data = "This is a line of text inside the BufferedOutput.txt";

        try {
            // Creates a FileOutputStream
            FileOutputStream file = new FileOutputStream("Files/BufferedOutput.txt");

            // Creates a BufferedOutputStream
            BufferedOutputStream output = new BufferedOutputStream(file);

            byte[] array = data.getBytes();

            // Writes data to the output stream
            output.write(array);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}