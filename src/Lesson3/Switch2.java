package Lesson3;

public class Switch2 {
    public static void main (String [] args) {
        int order = 49;

        switch (order) {
            case 49:
                System.out.println("The customer ordered a salad pizza alongside Coca Cola.");
                break;
            case 50:
                System.out.println("The customer ordered a double hamburger alongside Fanta Exotic.");
                break;
            default:
            System.out.println("The customer is still thinking about what to order!.");
        }
    }
}
