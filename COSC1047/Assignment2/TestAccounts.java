public class TestAccounts {
    public static void main(String[] args) {
        Account myAccount = new Account(2, 2500);
        myAccount.setAnnualInterestRate(5.5 * 100);
        System.out.println(myAccount.toString());
        CheckingAccount myAccount2 = new CheckingAccount();
        System.out.println(myAccount2.toString());
        SavingAccount myAccount3 = new SavingAccount();
        System.out.println(myAccount3.toString());
    }
}
