/**
Author: Mohammad Baqir
Student ID: 239330870
Lab 4
Any and all work in this file is my own
 */
package COSC2006.Lab4;

public class Test {

    public static void main(String[] args) throws BankException {

        // balance less then 0
        try {
            BitBank myAccount = new BitBank("GB821234", -50);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }

        // invalid account number
        try {
            BitBank myAccount = new BitBank("CA123456", 50);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }

        // account success
        BitBank myAccount = new BitBank("GB821234", 1050.23);
        System.out.println("Account balance is: " + myAccount.getBalance());

        // to test withdraw error
        try {
            myAccount.withdraw(1100.25);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }

        // successfully withdrawal
        myAccount.withdraw(50);
        System.out.println(myAccount.toString());

        // to test deposit error
        try {
            myAccount.deposit(-50);
        } catch (BankException e) {
            System.err.println(e.getMessage());
        }

        // successfully deposit
        myAccount.deposit(1000);
        System.out.println("Account balance is: " + myAccount.getBalance());
        System.out.println(myAccount.toString());
    }

}
