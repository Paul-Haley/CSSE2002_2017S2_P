package week05;

public class Account {
    private int balance;
    
    public static void main(String[] arg) {
        Account a = new Account();
        a.deposit(9001);
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
     */
    public int deposit(int amount) {
        assert amount >= 0 : "precondition of deposit violated";
        balance += amount;
        return balance;
    }
    
    /** Withdraw an amount from this account.
    * @require amount >= 0 && amount <= getBalance
    * @ensure getBalance == \old(getBalance) - amount &&
    * \result == getBalance
    */
    public int withdraw(int amount) {
        assert amount >= 0 && amount <= balance : 
            "precondition of withdraw violated";
        balance -= amount;
        return balance;
    }

    public String toString() {
        return "Your balance is: $" + balance;
    }
}
