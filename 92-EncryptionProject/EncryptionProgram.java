
// Import Libraries
import java.util.*;

public class EncryptionProgram {

    private Scanner sc;
    private Random random;
    private ArrayList<Character> list;
    private ArrayList<Character> shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;

    EncryptionProgram() {
        sc = new Scanner(System.in);
        random = new Random();
        list = new ArrayList();
        shuffledList = new ArrayList();
        character = ' ';

        newKey();
        askQuestion();
    }

    private void askQuestion() {
        while (true) {
            System.out.println("************************************************");
            System.out.println("What do you want to do?");
            System.out.print("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit: ");
            char response = Character.toLowerCase(sc.nextLine().charAt(0));

            switch (response) {
                case 'n':
                    newKey();
                    break;

                case 'g':
                    getKey();
                    break;

                case 'e':
                    encrpyt();
                    break;

                case 'd':
                    decrypt();
                    break;

                case 'q':
                    quit();
                    break;

                default:
                    System.out.println("Not a valid answer :(");
                    break;
            }
        }
    }

    private void newKey() {
        character = ' ';
        list.clear();
        shuffledList.clear();

        for (int i = 32; i < 127; i++) {
            list.add(Character.valueOf(character));
            character++;
        }

        shuffledList = new ArrayList(list);
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been generated.");
    }

    private void getKey() {
        System.out.println("Key: ");
        for (Character x : list) {
            System.out.print(x);
        }
        System.out.println();
        for (Character y : shuffledList) {
            System.out.print(y);
        }
        System.out.println();
    }

    private void encrpyt() {
        System.out.print("Enter a message to be Encrypted: ");
        String message = sc.nextLine();

        letters = message.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (letters[i] == list.get(j)) {
                    letters[i] = shuffledList.get(j);
                    break;
                }
            }
        }

        System.out.print("Encrypted: ");
        for (char letter : letters) {
            System.out.print(letter);
        }
        System.out.println();

    }

    private void decrypt() {

        if (letters != null) {
            for (int i = 0; i < letters.length; i++) {
                for (int j = 0; j < shuffledList.size(); j++) {
                    if (letters[i] == shuffledList.get(j)) {
                        letters[i] = list.get(j);
                        break;
                    }
                }
            }

            System.out.print("Decrypted: ");
            for (char letter : letters) {
                System.out.print(letter);
            }
            System.out.println();
        } else {
            System.out.println("FIRST ENCRYPT SOMETHING.");
        }
    }

    private void quit() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
