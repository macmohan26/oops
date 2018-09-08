package ConsOverloading;


public class BankAccountApp {

    public static void main(String[] args) {
        // Creating a new bank account >> think instantiating an object.

        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "012345"; // not the static variable
      //  acc1.name = "Roger Hue";
      //  With Encapsulation : Public API Methods.
        acc1.setName("Roger Hue");
        System.out.println(acc1.getName());

        acc1.setSsn("1234567");
        System.out.println("SSN: " +acc1.getSsn());


        acc1.balance = 10000;

        // Polymorphism through overriding.

        System.out.println(acc1.toString());

        // getting access from interface methods.

        acc1.setRate();
        acc1.increaseRate();

        // Polymorphism through overloading.

        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "012346"; // not the static variable

        BankAccount acc3 = new BankAccount("Saving Account", 5000);

        acc3.accountNumber = "012347"; // not the static variable

//        System.out.println( " Bank Branch Routing Number is: " + acc1.routingNumber); // routingNumber the static variable
//        System.out.println( " Bank Branch Routing Number is: " + acc2.routingNumber);
//        System.out.println( " Bank Branch Routing Number is: " + acc3.routingNumber);

        // Demo for Inheritance

        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
      //  cd1.name = "Juan";
        cd1.accountType = "CD Account";
        System.out.println(cd1.toString());

    }
}
