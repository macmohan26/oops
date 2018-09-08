package ConsOverloading;

public class BankAccountApp {

    public static void main(String[] args) {
        // Creating a new bank account >> think instantiating an object.

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Checking Account");
        BankAccount acc3 = new BankAccount("Saving Account", 5000);
    }
}
