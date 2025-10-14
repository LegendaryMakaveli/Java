public class BankAccount {
    private String fullName;
    private double balance;

    public BankAccount(String fullName) {
        this.fullName = fullName;
    }

    public void setName(String fullName) {
        this.fullName = fullName;
    }
    public String getName() {
        return this.fullName;
    }

    public void deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    public double getBalance(){
        return balance;
    }

    public void withdraw(double amount){
        if(amount < 0)throw new IllegalArgumentException("Withdraw amount must be positive");
        if(amount > balance)throw new IllegalArgumentException("Insufficient funds");
        balance -= amount;
    }

    public double showBalance(){
        return balance;
    }
}
