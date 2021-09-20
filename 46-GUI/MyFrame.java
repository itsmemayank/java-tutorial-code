
// Import Packages
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class MyFrame extends JFrame {

    MyFrame() {
        this.setTitle("JFrame Title"); // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        this.setResizable(false); // prevents frame from being resized
        this.setSize(360, 360); // sets x-dimension and y-dimension of frame
        this.setVisible(true); // make frame visible

        ImageIcon image = new ImageIcon("minimal.jpg"); // create an ImageIcon
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(new Color(50, 50, 50)); // change color backround
    }
}