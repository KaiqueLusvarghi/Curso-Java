package bank;

public class Client {
    private String name;
    private int card;
    private double transicao;

public Client (String name,int card){
}

public Client (String name, int card, double depositoInicial){
    this.name = name;
    this.card = card;
   deposito(depositoInicial);
    
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public int getCard(){
    return card;
}


public double getTransicao(){
    return transicao;
}

public void deposito (double quantia){
    transicao += quantia ;
}

public void saque(double quantia){
    transicao -= quantia + 5.0;
}

public String toString(){
   

    return "CONTA " 
             + card
             + ", Nome: "
             + name
             +", conta: $"
             + transicao
             + System.out.printf("%.2f \n \n", transicao );
        
}
}
