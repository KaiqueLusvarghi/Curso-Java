package application;

import java.text.ParseException;

import entities.Account;
import entities.BusinessAccount;
//import entities.BusinessAccount;
import entities.SavingsAccount;

public class App {
    public static void main(String[] args) throws ParseException {

       Account acc1 = new Account(1011, "Kaikao", 1000.0);
       acc1.withdraw(200.0);
       System.out.println(acc1.getBalance());

       Account acc2 = new SavingsAccount(1002, "Kaique", 1000.0, 0.01);
       acc2.withdraw(200.0);
       System.out.println(acc2.getBalance());

       Account acc3 = new BusinessAccount(1100, "kaka", 1000.0, 500.0) ;
       acc3.withdraw(200.0);
       System.out.println(acc3.getBalance());
    }
}
