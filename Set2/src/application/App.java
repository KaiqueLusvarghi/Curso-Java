package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

    
//---------------------------------------------------------------------------
        System.out.print(" Quantos alunos Tem no Curso A? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++){
            System.out.print("Digite o Id do " + i + "º Aluno: ");
            int number = sc.nextInt();  // lendo o id do aluno
            a.add(number); // add o id do aluno na "contagem"
        }
//---------------------------------------------------------------------------
        System.out.println();
//---------------------------------------------------------------------------
        System.out.print(" Quantos alunos Tem no Curso B? ");
         n = sc.nextInt();
         System.out.println();
        for (int i = 1; i <= n; i++){
            System.out.print(" Digite o Id do " + i + "º Aluno: ");
            int number = sc.nextInt();  // lendo o id do aluno
            b.add(number); // add o id do aluno na "contagem
        }
//---------------------------------------------------------------------------
        System.out.println();
//---------------------------------------------------------------------------
        System.out.print(" Quantos alunos Tem no Curso C? ");
         n = sc.nextInt();
         System.out.println();
        for (int i = 1; i <= n; i++){
            System.out.print("Digite o Id do " + i + "º Aluno: ");
            int number = sc.nextInt();  // lendo o id do aluno
            c.add(number); // add o id do aluno na "contagem"
        }
//---------------------------------------------------------------------------        

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println(" \n O total de estudande é : " + total.size());


    }
}
