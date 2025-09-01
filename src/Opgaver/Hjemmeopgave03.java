package Opgaver;

public class Hjemmeopgave03 {
    public static void main (String [] args) {
        //opgave 1, T-shirts
        String color1 = "black t-shirt,";
        String color2 = "blue t-shirt,";
        String color3 = "pink t-shirt,";
        String color4 = "brown t-shirt,";
        String color5 = "white t-shirt,";
        String color6 = "green t-shirt,";

        String size1 = " XS, ";
        String size2 = " S, ";
        String size3 = " M, ";
        String size4 = " L, ";
        String size5 = " XL, ";

        String print1 = "Courage print ";
        String print2 = "Muriel & Courage print ";
        String print3 = "Eustace print ";
        String print4 = "MrKatz print ";
        String print5 = "LeQuack print ";
        String print6 = "Return the Slab print ";

        int cPrint = 25;
        int cPrint2 = 20;
        int cPrint3 = 18;
        int cPrint4 = 16;

        System.out.println("I am a store that sells merchandise! Here is my selection of Courage the Cowardly Dog t-shirts and the cost:");
        System.out.println(print1 + color1 + size1 + size2 + size3 + size4 + size5 + cPrint + "€.");
        System.out.println(print2 + color5 + size2 + size1 + size3 + size4 + cPrint2 + "€.");
        System.out.println(print3 + color2 + size2 + size3 + size4 + cPrint2 + "€.");
        System.out.println(print4 + color4 + size3 + size1 + size5 + cPrint3 + "€.");
        System.out.println(print5 + color6 + size4 + size3 + size2 + cPrint4 + "€.");
        System.out.println(print6 + color3 + size3 + size4 + cPrint4 + "€.");
    }
}
