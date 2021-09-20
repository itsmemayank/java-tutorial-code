import java.io.PrintWriter;

class printWriter {
  public static void main(String[] args) {

    String data = "This is a text inside the file.";
    int len = data.length();

    try {
      PrintWriter output = new PrintWriter("Files/output.txt");

      // print() method
      output.print(data);

      // printf() method
      output.printf("Length is: %d", len);

      // close() method
      output.close();
    }
    catch(Exception e) {
      e.getStackTrace();
    }
  }
}