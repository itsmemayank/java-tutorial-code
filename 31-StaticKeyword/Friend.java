
class Friend {

    String name;
    static int numOfFriends = 0; // Static Variable

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void displayFriends() {
        System.out.println("Total " + numOfFriends + " Friends.");
    }
}