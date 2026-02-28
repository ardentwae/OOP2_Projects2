public class Card {
    // Attributes from the UML Diagram
    private String cardNumber; // String is better for masking logic
    private double balance;
    private int pin;
    private boolean status;

    // Constructor: Parameterized to initialize all fields
    public Card(String cardNumber, double balance, int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    // Task A: Security Logic
    public void updatePin(int oldPin, int newPin) {
        if (this.pin == oldPin) {
            this.pin = newPin;
            System.out.println("PIN updated successfully.");
        } else {
            System.out.println("Error: Current PIN is incorrect.");
        }
    }

    // Task A: Behavioral Method
    public void activateCard() {
        this.status = true;
        System.out.println("Card activated successfully!");
    }

    // Task A & Bonus: Reporting with Masking
    @Override
    public String toString() {
        String masked = "XXXX-XXXX-XXXX-" + cardNumber.substring(cardNumber.length() - 4);
        return "Card Details: [Number: " + masked + ", Balance: $" + balance + ", Active: " + status + "]";
    }
}