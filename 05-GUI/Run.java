
// Import Packages
import javax.swing.JOptionPane;

public class Run {
    public static void main(String[] args) {
        // Taking Input using JOptionPane
        String name = JOptionPane.showInputDialog(null, "Enter Your Name: ");
        JOptionPane.showMessageDialog(null, "Hello, " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Your Age: "));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        String food = JOptionPane.showInputDialog(null, "Enter Your Favorite Food: ");
        JOptionPane.showMessageDialog(null, "You like " + food);
    }
}
