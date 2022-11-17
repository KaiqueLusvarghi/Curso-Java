package application;

import java.util.Locale;
import java.util.Scanner;



/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver. 
 */
public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("*** Informe quantas pessoas estão na pesquisa ***");

        int n = sc.nextInt();
        int nmeores;
        double alturat,alturam,percentualmenores;

        String [] nome = new String[n];
        int []idade = new int[n];
        double [] altura = new double[n];

        //Pegandos as informaões das pessoas dentro do for de uma vez 
        for(int i = 0; i < n; i ++){
            System.out.printf("Digite os dados da %da pessoa:\n", 1+i);
            System.out.println("NOME: ");            
            nome[i] = sc.next();   
            System.out.println("IDADE: ");
            idade[i] = sc.nextInt();
            System.out.println("ALTURA: ");
            altura[i] = sc.nextDouble();
            System.out.println();

        }
        //Mostrando a soma total das pessoas e a quantidade de menores de 16

        alturat = 0;
        nmeores = 0;

        for(int i = 0; i < n; i++){
            if(idade[i] < 16){
                nmeores ++;
            }
            alturat = alturat + altura[i];
        }

            //pegando a media de altura , e o percentual de menores
        alturam = alturat / n;
        percentualmenores = ((double)nmeores / n) * 100;
            // exibindo a altura media, quantas pessoas são de menores e o percentual de menores 
        System.out.printf ("\n Altura média = %.2f \n", alturam);
        System.out.println ("\n Pessoas com menos de 16 anos: = "  + nmeores);
        System.out.printf ("\n Porcentagem de menores  = %.1f \n", percentualmenores);

        // Mostrando quem são os de menores de 16 
        for(int i = 0; i <n ; i++){
            if(idade[i]< 16){
                System.out.printf("%s\n", nome[i]);
            }
        }

        sc.close();
    }
}
