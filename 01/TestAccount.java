public class TestAccount {
    public static void main(String[] args) {
        Account acc = new Account(1234, 100);
        acc.setAnnualInterestRate(6.7);
        acc.withdraw(101);
        acc.withdraw(50);
        acc.depsit(1000);
        System.out.println(
                "Balance: $" + acc.getBalance() + "\nAnnual Interest Rate: " + (acc.getAnnualInterestRate())
                        + "% \nDate account created: " + acc.getDateCreated());
    }
}
