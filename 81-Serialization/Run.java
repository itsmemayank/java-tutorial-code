
// Import Packages
import java.io.*;

public class Run implements Serializable {

    public static void main(String[] args) {

        // Serialization - The process of converting an object into a byte stream.

        // Deserialization - The reverse process of converting a byte stream into an
        // object.

        // SERIALIZE
        User user = new User();

        user.name = "Mayank";
        user.password = "idontknow";

        try {
            System.out.println("\nSerializer:");
            FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("Object info saved!");
        } catch (IOException i) {
            i.printStackTrace();
        }

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: " + serialVersionUID);

        // ************************************************************ */

        // DESERIALIZE
        User _user = null;

        FileInputStream fileIn;
        try {
            System.out.println("\nDeserializer:");
            fileIn = new FileInputStream(
                    "C:\\Users\\mayan\\Man~Dev\\~Softwares\\Java@Core\\81-Serialization\\UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            _user = (User) in.readObject();
            in.close();
            fileIn.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        long _serialVersionUID = ObjectStreamClass.lookup(_user.getClass()).getSerialVersionUID();
        System.out.println("serialVersionUID: " + _serialVersionUID);

        System.out.println("name: " + _user.name);
        System.out.println("password: " + _user.password);

        _user.sayHello();
    }
}