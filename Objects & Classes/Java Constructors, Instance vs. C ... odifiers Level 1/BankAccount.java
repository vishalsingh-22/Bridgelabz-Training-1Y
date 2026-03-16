class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int accNo, String holder, double bal) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = bal;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}