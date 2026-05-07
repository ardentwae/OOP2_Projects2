public class Client {
    private int idNumber;
    private String firstName;
    private String lastName;
    private int age;
    private Card card; // The "Has-A" relationship

    // Task B: Constructor with Composition & Validation
    public Client(int id, String fName, String lName, int age,
                  int cardNum, double bal, int pin, boolean status) {

        // Validation: Age must be 18+
        if (age < 18) {
            throw new IllegalArgumentException("Client must be 18 or older to partake.");
        }

        this.idNumber = id;
        this.firstName = fName;
        this.lastName = lName;
        this.age = age;

        // Initializing the Card object internally
        this.card = new Card(cardNum, bal, pin, status);
    }

    public void setIdNumber(int _idNumber) {
        this.idNumber = _idNumber;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setFirstName(String _firstName) {
        this.firstName = _firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String _lastName) {
        this.lastName = _lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAge(int _age) {
        this.age = _age;
    }

    public int getAge() {
        return this.age;
    }

    public void setCard(Card _card) {
        this.card = _card;
    }

    // Helper to access the card from the Main app
    public Card getCard() {
        return card;
    }

    @Override
    public String toString() {
        return "Client: " + firstName + " " + lastName + " (ID: " + idNumber + ")\n" + card.toString();
    }
}