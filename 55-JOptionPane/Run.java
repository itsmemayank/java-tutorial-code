
// Import Packages
import javax.swing.JOptionPane;

public class Run {

    public static void main(String[] args) {

        // JOptionPane = pop up a standard dialog box that prompts users for a value
        // or informs them of something.

        JOptionPane.showMessageDialog(null, "This is a message dialog box", "PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Here is some useless info", "INFORMATION_MESSAGE",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "really?", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Your computer has a VIRUS!", "WARNING_MESSAGE",
                JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "CALL TECH SUPPORT OR ELSE!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null, "bro, do you even code?", "This is my title",
                JOptionPane.YES_NO_CANCEL_OPTION);

        switch (answer) {
            case 0:
                System.out.println("GoodJob, Continue working.");
                break;

            case 1:
                System.out.println("Then do some code.");
                break;

            case 2:
                System.out.println("You have to answer, you cannot go like this.");
                break;
            default:
                break;
        }

        String name = JOptionPane.showInputDialog("What is your name?: ");

        System.out.println("Hello, " + name);
    }
}