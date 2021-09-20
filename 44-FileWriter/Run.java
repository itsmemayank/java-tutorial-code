import java.io.FileWriter;
import java.io.IOException;

public class Run {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red,\n");
            writer.append("Violets are blue,\n");
            writer.append("Unexpected '{',\n");
            writer.append("On line 32.\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}