package Opgaver;

public class Boolean {
    public static void main (String [] args) {
        boolean DullyIsCool = true;
        boolean DullyLikesCoriander = false;

        System.out.println(DullyIsCool);
        System.out.println(DullyLikesCoriander);

        IntBoolean();
    }
    public static void IntBoolean() {
        int x = 9;
        System.out.println (10 < 9);
        System.out.println (9 < 10);
        System.out.println (9 == 9);
        System.out.println (x == 9);
        System.out.println (x != 8);

        IfElseBoolean();
    }
    public static void IfElseBoolean() {
        int Age = 23;
        int FullyDevelopedBrain = 25;

        System.out.println(Age >= FullyDevelopedBrain);

        if (Age >= FullyDevelopedBrain) {
            System.out.println("My frontal lobe is fully developed!");
        } else {
            System.out.println("I still need a couple of years before my brain is fully developed.");
        }

        //Another example!

        int DoorCode = 9137;

        if (DoorCode == 9137) {
            System.out.println("Door is unlocked.");
        } else {
            System.out.println("ERRRRR WRONG CODE! GO AWAY!");
        }
        //Example with else-if:
        int mood = 1; //1 = Good, 2 = Neutral, 3 = Bad

        if (mood == 1) {
            System.out.println("Dully is in a good mood!");
        } else if (mood == 2) {
            System.out.println("Dully is feeling a bit bored.");
        } else {
            System.out.println("Dully is in a bad mood! Leave him be for a bit.");
        }
    }
}