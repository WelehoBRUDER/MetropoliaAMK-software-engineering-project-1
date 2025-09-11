public class Account {
    private double balance;
    private double withdrawLimit;

    public Account() {
        balance = 0.0;
        withdrawLimit = 800.0;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        if (amount < 0.5) {
            System.out.println("You can't deposit less than 0.5€");
            return;
        }
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (amount < 0.5) {
            System.out.println("You can't withdraw less than 0.5€");
            return 0.0;
        }
        if (amount > balance || withdrawLimit < amount) {
            System.out.println("Trying to withdraw too much at once!");
            System.out.println("Your current balance is " + this.balance + "€, maximum withdrawal is " + this.withdrawLimit + "€");
            return 0.0;
        }
        this.balance -= amount;
        return amount;
    }
    public double getBalance() {
        return balance;
    }

}
