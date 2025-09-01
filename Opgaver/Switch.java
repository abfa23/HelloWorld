package Opgaver;

public class Switch {

    public static void main(String[] args) {
        int day = 7;

        switch (day) {
            case 1:
                System.out.println("It's Monday!");
                break;

            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("I don't know the day of the week!");

                /*Explanation: Switch is being called once.
                Thereafter, the result is compared with each case, until it finds a match.
                When it finds a match, it will print out the corresponding block of code.
                The break statement stops the program from searching for more matches, once it has found its match.
                The default statement runs if there is no match.
                 */
        }
    }
}