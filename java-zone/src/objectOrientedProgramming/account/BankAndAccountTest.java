package objectOrientedProgramming.account;

import java.util.ArrayList;

public class BankAndAccountTest {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account: accounts) {
            System.out.println(account.toString());
        }

        System.out.println("\nAfter depositing 1000 into account1");
        bank.depositMoney(account1, 1000);
        System.out.println(account1.toString());
        System.out.println("No transaction into account2: ");
        System.out.println(account2.toString());
        System.out.println("After withdraw 5000 from account3: ");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.toString());
    }
}
