
// Import Packages
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import javax.sound.sampled.*;

public class Run {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        // Scanner Initialized
        Scanner scanner = new Scanner(System.in);

        File file = new File("test.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while (!response.equals("q")) {
            System.out.println("\np = play, s = Stop, r = Reset, q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toLowerCase();

            switch (response) {
                case ("p"):
                    clip.start();
                    break;
                case ("s"):
                    clip.stop();
                    break;
                case ("r"):
                    clip.setMicrosecondPosition(0);
                    break;
                case ("q"):
                    clip.close();
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        }

        System.out.println("Byeeee!");

        // Scanner Closed
        scanner.close();

    }
}