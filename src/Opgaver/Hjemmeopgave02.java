package Opgaver;
//Hjemmeopgave02
public class Hjemmeopgave02 {
    public static void main (String[] args) {
        //Opgave 1:
        String name = """
                *************************
                * Abdulwahid Fartoosi *
                *\tAbfa0002@stud.ek.dk\t*
                *************************""";
        System.out.println(name);

        Opgave02();
    }
    public static void Opgave02() {
        System.out.println("Hello world!");
        Opgave03();
    }
    public static void Opgave03() {
        //Forskellen mellem print og println er, at println svarer til at man sætter et \n, altså flytter til næste linje nedunder.
        //Print udskriver bare på samme linje.
        System.out.print("Hej");
        System.out.println(" med dig!");
        System.out.println("Hej til dig også!");

        Opgave04 ();
    }
    public static void Opgave04() {
        //Dette er kommentarer, altså starter med //.
        //Hvis man sætter // forrest i linjen med println() så får man bare ét enkelt / udskrevet.
        //
         /* Dette er en flerlinje kommentar.
          */
    }
}