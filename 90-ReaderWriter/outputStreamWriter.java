import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class outputStreamWriter {

  public static void main(String args[]) {

    String data = "This is a line of text inside the _ file.";

    try {
      // Creates a FileOutputStream
      FileOutputStream file = new FileOutputStream("Files/output.txt");

      // Creates an OutputStreamWriter
      // converts characters into bytes.
      OutputStreamWriter output = new OutputStreamWriter(file);

      // Writes string to the file
      output.write(data);

      // Closes the writer
      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}