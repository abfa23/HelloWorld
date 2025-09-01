package Opgaver;
import java.util.Scanner;

public class ScannerImport {
    public static void main (String [] args) {
        String username;
        String password;
        Scanner Systemin = new Scanner(System.in); //Creates a scanner object
        System.out.println("Enter username and password");

        username = Systemin.nextLine();
        password = Systemin.nextLine();
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        Scanner2();
    }
    public static void Scanner2() {
        String name;
        int age;
        Scanner Info = new Scanner(System.in);
        System.out.println("Enter your name and age");

        name = Info.nextLine();
        age = Info.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}