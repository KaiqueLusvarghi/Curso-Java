package entities;

public class SavingsAccount extends Account {

    private Double interesRate;

    public SavingsAccount (){
        super();
    }
    public SavingsAccount (Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interesRate = interestRate;
    }
    public Double getInteresRate() {
        return interesRate;
    }
    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }

    public void updateBalance(){
        balance += balance * interesRate;
    }
    @Override
    public void withdraw(double amount){
        balance -= amount;
    }
}
