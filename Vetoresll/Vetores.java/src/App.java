
import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
                - Imprimir todos os elementos do vetor 
                - Mostrar na tela a soma e a média dos elementos do vetor  */

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Informe a quantidade de numeros que deseja somar");

        int n = sc.nextInt();
        double soma, media;
        
        // vet está recebendo a quantidade que irá ter no seu vetor 
        double [] vet = new double[n];

        for(int i = 0; i < n; i ++){

            System.out.println("Digite um numero: \n");
            vet[i]= sc.nextDouble();
        }
        // aqui esta pegando a  variavel SOMA e somando todos os valores inseridos no vet 
        soma = 0;
        for(int i = 0; i < n; i++){
            soma = soma + vet[i]     ;
        }
        // fazendo a media dos numeros digitados 
        media = soma/n;
            // Mostrando os valores digitados em cada posição do vet
        for(int i = 0; i< n; i++){

            System.out.println(vet[i]);
        }
        //exibindo a soma e a media 
        System.out.println();
        System.out.printf("A soma dos numeros eh: %.2f " , soma);
        System.out.printf("\nA media dos numeros eh: %.2f" , media);

        sc.close();
    }
}
