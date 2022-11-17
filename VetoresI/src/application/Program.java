package application;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */


public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite quantos numeros vai digitar 'menos que 10 numeros !' \n ");
        
        int x = sc.nextInt();
        //informando que o vetor tera o tamanho de x ;
        int [ ] vetor = new int[x];
        
        for(int i = 0; i < x; i++ ){
            
            System.out.println("Digite um numero : ");
            //informando que o vetor na posição i recebera o valor informado pelo usuario
            vetor [i] = sc.nextInt();
        }

        System.out.println("Numeros Negativos");

        for(int i = 0; i < x; i++){
        // se o numero na posião i for menor que zero, imprimirá apenas os valores negativos ;
            if(vetor[i] < 0){
                System.out.println("\n" + vetor[i]);
            }
        }
        sc.close();

    }
}
