// During the read operation in BufferedInputStream, a chunk of bytes is read from the disk and stored in the internal buffer. 
// And from the internal buffer bytes are read individually.
// This is why reading bytes is faster using the BufferedInputStream.

import java.io.BufferedInputStream;
import java.io.FileInputStream;

class BufferedInput {
    public static void main(String[] args) {
        try {

            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("Files/BufferedInput.txt");

            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);

            // Initialized and Reads first byte from file
            int i = input.read();

            while (i != -1) {
                System.out.print((char) i);

                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}