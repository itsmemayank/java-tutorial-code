
class Run {
    public static void main(String[] args) {

        // Static Keyword - a single copy of a variable/method is created and shared.

        Friend friend1 = new Friend("Tom");
        Friend friend2 = new Friend("Mark");
        Friend friend3 = new Friend("Rick");

        // Static member can only be accessed through class
        System.out.println("Number of Friends = " + Friend.numOfFriends);

        // Static method can only be accessed through class
        Friend.displayFriends();
    }
}