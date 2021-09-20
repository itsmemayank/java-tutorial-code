
public class Run {

    public static void main(String[] args) {

        // Method Chaining - a common method for invoking multiple method calls in OOP

        String skill = "    Java";

        // Without Method Chaining
        // skill = skill.concat(" Core ");
        // skill = skill.toUpperCase();
        // skill = skill.trim();
        // System.out.println(skill);

        // With Method Chaining
        skill = skill.concat(" Core ").toUpperCase().trim();
        System.out.println(skill);
    }
}