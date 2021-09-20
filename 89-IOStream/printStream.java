import java.io.PrintStream;

class printStream {
    public static void main(String[] args) {

        String data = "This is a text inside the file PrintOutput.txt";
        String lang = "Java";

        try {
            PrintStream output = new PrintStream("Files/PrintOutput.txt");
            
            // print() Method
            output.print(data); 

            // printf method
            output.printf("This is a Tutorial of %s Programming", lang);
            
            // close() method
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}