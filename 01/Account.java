import java.sql.Date;
import java.time.LocalDate;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private LocalDate dateCreated = LocalDate.now();

    Account() {
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate * 100;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate / 100;
    }

    public LocalDate getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterest(double annualInterestRate) {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= 0)
            balance -= amount;
        else
            System.out.print("Not enough balance\n");
    }

    public void depsit(double amount) {
        balance += amount;
    }
}
