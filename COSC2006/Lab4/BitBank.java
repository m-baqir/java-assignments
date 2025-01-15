/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 4
Any and all work in this file is my own
 */
package COSC2006.Lab4;

public class BitBank {
    private String accountNum;
    private double balance;

    BitBank(String accountNum, double balance) throws BankException {
        if (verify(accountNum))
            this.accountNum = accountNum;
        else
            throw new BankException("Account number is invalid");
        if (balance <= 0.0)
            throw new BankException("Balance less than equal to 0");
        else
            this.balance = balance;
    }

    public void deposit(double amount) throws BankException {
        if (amount > 0.0)
            balance += amount;
        else
            throw new BankException("Amount to deposit is less than equal to 0");
    }

    public void withdraw(double amount) throws BankException {
        if (amount > 0.0 && amount <= balance)
            balance -= amount;
        else
            throw new BankException(
                    "Amount to withdraw is less than equal to 0 or the amount to withdraw is greater then balance");
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount[accountNumber=" + accountNum + ", balance=$" + balance + "]";
    }

    private static boolean verify(String accountNum) {
        // verify length
        if (accountNum.length() == 8) {
            // convert to uppercase, get the first and second char, ascii value minus 55 to
            // get the hex value ex. A = 65-55 = 10
            int char1 = accountNum.toUpperCase().charAt(0) - 55;
            int char2 = accountNum.toUpperCase().charAt(1) - 55;
            // create new string with last 4 characters to front
            String newString = accountNum.substring(4, accountNum.length()) + char1 + char2
                    + accountNum.substring(2, 4);
            // convert string to long
            Long newLong = Long.parseLong(newString);
            if (newLong % 11 == 1) {
                return true;
            }
        }
        return false;
    }
}
