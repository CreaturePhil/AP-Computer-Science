public class BankAccount { 
     
    private String accName; // acc is short for account 
    private int accNum; 
    private double balance; 
    public BankAccount (String accountName, int accountNumber){ 
        accName = accountName; 
        accNum = accountNumber; 
        balance = 0; 
    } 
    public BankAccount (String accountName, int accountNumber, double previousBalance){ 
        accName = accountName; 
        accNum = accountNumber; 
        balance = previousBalance; 
    } 
     
    public double desposit(double amount){ 
        balance = balance + amount; 
        return balance; 
    } 
     
    public double withdraw (double amount) { 
        balance = balance - amount; 
        return balance; 
    } 
     
    public String getName(){ 
        return accName; 
    } 
     
    public int getAccountNumber(){ 
        return accNum; 
    } 
     
    public double getBalance() { 
        return balance; 
    } 
     
    public String toString() { 
        return accNum + "\t" + accName + "\t" + "$" + balance; 
    } 
     
    public double addInterest(double rate){ 
        balance = (balance*rate) + balance; 
        return balance; 
    } 
     
    public int setAccountNumber(int acctNum){ 
            accNum = acctNum; 
            return accNum; 
    } 
     
} 
