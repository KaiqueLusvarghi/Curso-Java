package services;

public class BrazilInterestService  implements InterestService{

    private double interestRate;  //Taxa de juros

    public BrazilInterestService (double interestRate){
        this.interestRate = interestRate;
    }
    @Override
    public double getInterestRate() {
        return interestRate;
    }
    //função de pagamento
    /*@Override
    public double payment(double amount, int months) {
        if (months < 1){
            throw new InvalidParameterException(" Months must be greater than zero");
        }
        return amount * Math.pow(1.0 + interestRate / 100.0, months);
    }*/
    
}
