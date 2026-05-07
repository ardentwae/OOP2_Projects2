public class Card {
    // Attributes were taken from the diagram
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;


    public Card(int cardNumber, double balance, int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    public void setCardNumber(int _cardNumber) {
        this.cardNumber = _cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
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

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    // Task A: Behavioral Method
    public void activateCard() {
        this.status = true;
        System.out.println("Card activated successfully!");
    }

    // Task A & Bonus: Reporting with Masking
    @Override
    public String toString() {
        return "Card{" +
                "cardNumber='" + cardNumber + '\'' +
                ", balance=" + balance +
                ", pin=****" +
                ", status=" + status +
                '}';
    }
}