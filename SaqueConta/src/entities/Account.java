package entities;

import exception.BusinessExecption;

public class Account {

  private Integer number;
  private String holder;
  private Double balance;
  private Double withdrawLimite;

  public Account() {}

  public Account(
    Integer number,
    String holder,
    Double balance,
    Double withdrawLimit
  ) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withdrawLimite = withdrawLimit;
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public Double getWithdrawLimite() {
    return withdrawLimite;
  }

  public void setWithdrawLimite(Double withdrawLimite) {
    this.withdrawLimite = withdrawLimite;
  }

  public void deposit(double amount) {
    balance += amount;
  }

  public void withdraw(double amount) {
    validateWithdraw(amount);
    balance -= amount;
  }

  public void validateWithdraw(double amount) {
    if (amount > getWithdrawLimite()) {
      throw new BusinessExecption("Erro de saque: A quantidade excede o limite de saque");
    }
    if (amount > getBalance()) {
      throw new BusinessExecption("Erro de saque: Saldo induficiente");
    }
  }
}
