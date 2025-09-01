package Lesson1.WriteToConsol;
//Først lektionskodning!
public class WriteToConsol02 {
    public static void main(String[] args) {

        String name = "My name is Abdul!";
        System.out.println(name);

        System.out.print("Hello");
        System.out.println("World!");

        System.out.println("Hello!\tHow are you?\nI'm amazing! You?\nI'm good, thanks!");

        System.out.println("Here is a little test calculation for you!");
        double f = 34;
        double g = 35;
        System.out.println(f*g);

        int x = 9;
        int y = 5;
        System.out.println(x/y);

        System.out.println("Now we will test a new method");

        Message02();
    }
    public static void Message02() {
        System.out.println("I eat lunch at home!");
    }
}