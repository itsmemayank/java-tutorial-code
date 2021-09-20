
// Import Packages
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame {

    MyFrame() {
        ImageIcon image = new ImageIcon("icon.jpg");
        Border border = BorderFactory.createLineBorder(Color.BLUE);

        JLabel label = new JLabel(); // create a label
        label.setText("Hello, Mayank"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP); // set text TOP,CENTER, BOTTOM of imageicon
        label.setForeground(new Color(0x00FF00)); // set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 100)); // set font of text
        label.setIconTextGap(-25); // set gap of text to image
        label.setBackground(Color.WHITE); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border); // sets border of label (not image+text)
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
        // label.setBounds(100, 100, 250, 250); // set x,y position within frame as well
        // as dimensions

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(1080, 720);
        // frame.setLayout(null);
        this.setVisible(true);
        this.add(label);
        this.pack(); // this should be at the end
    }
}