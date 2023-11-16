public class Person {
}

import java.util.Scanner;

class Person {
    String surname;
    String firstName;
    String street;
    String zipCode;
    String city;

    void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter street: ");
        street = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }

    void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }
}
