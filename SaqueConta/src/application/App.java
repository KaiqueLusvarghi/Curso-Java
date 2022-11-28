package application;

import entities.Account;
import exception.BusinessExecption;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe os dados da conta ");
    System.out.print("Numero:  ");
    int number = sc.nextInt();
    System.out.print("titular:  ");
    sc.nextLine();
    String holder = sc.nextLine();
    System.out.print("Saldo inicial:  ");
    double balance = sc.nextDouble();
    System.out.print("Limite de Saque:  ");
    double withdrawLimite = sc.nextDouble();

    Account acc = new Account(number, holder, balance, withdrawLimite);

    System.out.println();
    System.out.println("Informe o valor de saque");
    double amount = sc.nextDouble();

    try {
      acc.withdraw(amount);
      System.out.printf("Novo saldo: %.2f%n ", acc.getBalance());
    } catch (BusinessExecption e) {
      System.out.println(e.getMessage());
    }

    sc.close();
  }
}
