public class CheckingAccount extends Account {
    double overdraftLimit = -10.0;

    public void withdraw(double amount) {
        if ((Account.balance - amount) >= overdraftLimit)
            balance -= amount;
        else
            System.out.print("Not enough balance\n");
    }

    public String toString() {
        return "The balance is: " + Account.balance + "\nThe annual interest rate is: " + Account.annualInterestRate;
    }
}
