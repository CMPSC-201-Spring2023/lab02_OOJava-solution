package labseven;

/**
* Account class that creates an Account
* It has one constructor and three methods.
* @author Janyl Jumadinova
*/
public class Account {
  // INSTANCE VARIABLES:
  private int accountNumber;
  private double balance;
  private Offer offer;

  /**
  * Constructor: specify starting balance, too.
  */
  public Account(int acnum, double bal, Offer of) {
    accountNumber = acnum;
    balance = bal;
    offer = of;
  }

  /** Mutator (set) method to add value to the balance.
  */
  public void deposit(double amount) {
    balance = balance + amount;
  }

  /** Mutator method to subtract value from the balance.
  */
  public void withdraw(double amount) {
    if (balance > amount) {
      balance = balance - amount;
    }
  }

  /** Accessor method to retrieve balance.
  */
  public double getBalance() {
    return balance;
  }

  /** Accessor method to retrieve the offer object.
  */
  public Offer getOffer() {
    return offer;
  }
}
