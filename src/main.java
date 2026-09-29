import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        int nextAge = 100 - age;
        System.out.println("You have " + nextAge + " years until you are 100 years old!");
    }
}
