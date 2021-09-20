
class Run {
    public static void main(String[] args) {

        // Super Keyword - refers to the superclass (parent) of an object.

        Hero hero1 = new Hero("Superman", 42, "Strength");
        System.out.println(hero1.toString());

        System.out.println();

        Hero hero2 = new Hero("Batman", 40, "Money");
        System.out.println(hero2.toString());

    }
}