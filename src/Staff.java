public class Staff {
}

import java.util.Scanner;

class Staff extends Person {
    String education;
    String position;

    @Override
    void initialize() {
        super.initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    @Override
    void print() {
        super.print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}

