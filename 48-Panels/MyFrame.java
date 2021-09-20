
// Import Packages
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame {

    MyFrame() {
        JLabel redlabel = new JLabel();
        redlabel.setText("Hola");
        redlabel.setBounds(100, 100, 100, 100);

        JLabel bluelabel = new JLabel();
        bluelabel.setText("Hello");
        bluelabel.setBounds(100, 100, 100, 100);

        JLabel greenlabel = new JLabel();
        greenlabel.setText("Helo");
        greenlabel.setBounds(100, 100, 100, 100);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.RED);
        redpanel.setBounds(0, 0, 250, 250);
        redpanel.setLayout(null);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.BLUE);
        bluepanel.setBounds(250, 0, 250, 250);
        bluepanel.setLayout(null);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.GREEN);
        greenpanel.setBounds(0, 250, 500, 250);
        greenpanel.setLayout(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(750, 750);
        this.setVisible(true);
        redpanel.add(redlabel);
        bluepanel.add(bluelabel);
        greenpanel.add(greenlabel);
        this.add(redpanel);
        this.add(bluepanel);
        this.add(greenpanel);
    }
}