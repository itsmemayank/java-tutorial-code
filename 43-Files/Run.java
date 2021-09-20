import java.io.File;

public class Run {

    public static void main(String[] args) {

        // File - an abstract representation of file and directory pathnames.

        File file = new File("secret.txt");

        if (file.exists()) {
            System.out.println("Files Exists.");
            System.out.println(file.getAbsolutePath()); // displays absolute path
            System.out.println(file.getName()); // displays name of the file
            System.out.println(file.isFile()); // checks if it is a file
            file.delete(); // it will delete the secret.txt file
        } else {
            System.out.println("File Doesn't Exists.");
        }
    }
}