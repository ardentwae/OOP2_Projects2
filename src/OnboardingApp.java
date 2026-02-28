import java.util.Scanner;
import java.util.InputMismatchException;

public class OnboardingApp {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- Digital Banking Onboarding ---");
            System.out.print("Enter ID Number: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            System.out.print("First Name: ");
            String fName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lName = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter 16-digit Card Number: ");
            String cardNum = scanner.nextLine();

            System.out.print("Initial Balance: ");
            double bal = scanner.nextDouble();

            System.out.print("Set 4-digit PIN: ");
            int pin = scanner.nextInt();

            // 3. Instantiation
            Client user = new Client(id, fName, lName, age, cardNum, bal, pin, false);

            // 4. Operations
            System.out.println("\n--- Initial Profile ---");
            System.out.println(user);

            System.out.println("\nActivating Card...");
            user.getCard().activateCard();

            System.out.print("\nEnter old PIN to change it: ");
            int old = scanner.nextInt();
            System.out.print("Enter new PIN: ");
            int nextPin = scanner.nextInt();
            user.getCard().updatePin(old, nextPin);

            System.out.println("\n--- Final Updated Profile ---");
            System.out.println(user);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter numbers for ID, Age, Balance, and PIN.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}