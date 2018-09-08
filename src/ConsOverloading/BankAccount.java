package ConsOverloading;

public class BankAccount implements IRate {
    // Define variables

    String accountNumber = "1234567";

    // static >> belongs to the CLASS not the object instance.
    // final  >> constant (often static final)'

    private static final String routingNumber = "013546";

    private String name;
    private String ssn;
    String accountType;
    double balance;

    // Constructor definitions: unique methods
       // 1. They are used to define / setup / initialize properties of an object.
       // 2. Constructors are IMPLICITLY called upon INSTANTIATION.
       // 3. The same name as the class itself.
       // 4. Constructors have No return type.


    BankAccount(){
        System.out.println("NEW ACCOUNT CREATED");
    }

    // Overloading: call same method name with different arguments.

    BankAccount(String accountType){
        System.out.println("NEW ACCOUNT: " +accountType);
    }

    BankAccount(String accountType, double initDeposit){

        System.out.println("NEW ACCOUNT: " +accountType);
        System.out.println("INITIAL DEPOSIT OF: " +initDeposit);
    }

    // Getters and Setters
    // Allow the user to define the name.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Mr. " +name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public void setRate() {
        System.out.println("SETTING RATE");
    }

    @Override
    public void increaseRate() {
        System.out.println("INCREASING RATE");
    }

    public void deposit(double amount){

        balance = balance + amount;
        showActivity("DEPOSIT");

    }

    void withdraw(double amount){

        balance = balance + amount;
        showActivity("WITHDRAW");
    }

    // showActivity method only available in class because it is using "private" keyword.

    private void showActivity( String activity){

        System.out.println("YOUR RECENT TRANSACTION: " + activity);
        System.out.println("YOUR NEW BALANCE IS: $" + balance);
    }

    void checkBalance(){


    }

    void getStatus(){

    }

    @Override
    public String toString(){
        return "[ NAME: " + name + " . ACCOUNT # " + accountNumber + ". ROUTING # " + routingNumber +  ". BALANCE:  $ " + balance + " ]";
    }
}
