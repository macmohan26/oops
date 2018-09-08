package ConsOverloading;

public class BankAccountApp {

    public static void main(String[] args) {
        // Creating a new bank account >> think instantiating an object.

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "012345"; // not the static variable

        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "012346"; // not the static variable

        BankAccount acc3 = new BankAccount("Saving Account", 5000);

        acc3.accountNumber = "012347"; // not the static variable

        System.out.println( " Bank Branch Routing Number is: " + acc1.routingNumber); // routingNumber the static variable
        System.out.println( " Bank Branch Routing Number is: " + acc2.routingNumber);
        System.out.println( " Bank Branch Routing Number is: " + acc3.routingNumber);
    }
}
