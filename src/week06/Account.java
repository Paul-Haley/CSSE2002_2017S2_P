package week06;

import java.io.Serializable;

public class Account implements Serializable {
    private int balance;
    
    public static void main(String[] arg) {
        Account a = new Account();
    }
    
    /** Constructor for Account with no initial balance
     * @ensure balance = 0
     */
    public Account() {
        balance = 0;
    }
    
    /** Constructor for Account with balance of the amount
     * @require startingBalance >= 0
     * @ensure balance = startingBalance
     */
    public Account(int startingBalance) {
        balance = startingBalance;
    }
    
    /** Deposit amount into Account
     * @require amount >= 0
     * @ensure getBalance == \old(getBalance) + amount &&
     * \result == getBalance
     * @throws IllegalARgumentException thrown when amount is < 0
     */
    public int deposit(int amount) {
        if (amount < 0) throw new IllegalArgumentException();
        balance += amount;
        return balance;
    }
    
    /** Withdraw an amount from this account.
     * @throws YouAreTooPoorException 
    * @require amount >= 0 && amount <= getBalance
    * @ensure getBalance == \old(getBalance) - amount &&
    * \result == getBalance
    */
    public int withdraw(int amount) throws YouAreTooPoorException {
        if (amount < 0) throw new IllegalArgumentException();
        
        if (balance < amount) {
            throw new YouAreTooPoorException("The amount given is greater "
                    + "than the balance of the account");
        }
        balance -= amount;
        return balance;
    }

    public String toString() {
        return "Your balance is $" + balance;
    }
    
    /**
     * equals
     * @param other
     * @return
     */
    public boolean Equals(Object other) {
        if (!(other instanceof Account)) {
            System.out.println("failed here1");
            return false;
        }
        System.out.println("failed here2");
        return ((Account) other).balance == this.balance;
    }
}
