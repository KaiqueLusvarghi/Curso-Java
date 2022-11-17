package application;

import java.util.Locale;
import java.util.Scanner;
//import java.util.Locale;
import bank.Client;

public class Program {
     public static void main(String [] args){ 
     
           Scanner sc = new Scanner(System.in);
           Locale.setDefault(Locale.US);
           Client bank;  

           System.out.println("-- CRIANDO CONTA BANCARIA --");
           System.out.println("");
          // PEGANDO  O NOME DO CLIENTE  E O NUMERO DO CARTAO
           System.out.println("Informe Seu nome: ");
           String name = sc.nextLine();
       
           System.out.println("Informe o numero do cartao");
           int card = sc.nextInt();
           
           //PERGUNTANDO SE DESEJA FAZER UMA TRANSAÇÃO
           System.out.println("Deseja fazer um deposito? (s/n)");
           
           char r = sc.next().charAt(0);

               if(r == 's'){
                    System.out.println("Entre com o valor do deposito: ");

                    double depositoInicial = sc.nextDouble();

                    bank = new Client(name, card, depositoInicial );
                System.out.println(bank);

               }

               else  {
                    double depositoInicial = 0;
                    bank = new Client(name, card, depositoInicial );
                   System.out.println(bank);

                    System.out.println("Deseja faer um deposito? (y / n )");
                   
                    char res = sc.next().charAt(0);
                   if(res == 'y'){
                    System.out.println("Insira o valor do deposito: ");
                    double recebe = sc.nextDouble();
                    bank.deposito(recebe);
                    System.out.println(bank);
                   }
               }

               System.out.println();            
               System.out.println("Qual o valor que deseja sacar ? ");
               double saque = sc.nextDouble();
               bank.saque(saque);

               System.out.println("Atualiacao da conta \n SALDO:");
               System.out.println(bank);

               sc.close();

          }
}
