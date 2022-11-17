package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    System.out.println("Informe o tamanho da matriz");
    System.out.println("Quantas Linhas ?");
    int l = sc.nextInt();
    System.out.println("Quantas Colunas ?");
    int c = sc.nextInt();
    int mat[][] = new int[l][c];

    System.out.println("matriz  " + l + " Por " + c);
    // Preenchendo a matriz
    System.out.println("preencha a Matriz ?");

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
    System.out.print("Posição:  " + i + " , "+ j);

        mat[i][j] = sc.nextInt();
      }
    }
    // Exibindo a matriz com seus valores em suas tais posições
    System.out.println("A matriz ficou assim ");

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }

    // criando a varialvel para pesquisar um valor x da matriz
    System.out.println("Qual valor deseja buscar dentro da matriz");
    int x = sc.nextInt();
    // agora exibir as posições em volta do numero selecionado

    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[i].length; j++) {
        if (mat[i][j] == x) {
          System.out.println("Posição " + i + "," + j + ":");
          if (j > 0) {
            System.out.println("Esquerda: " + mat[i][j - 1]);
          }
          if (i > 0) {
            System.out.println("Encima: " + mat[i - 1][j]);
          }
          if (j < mat[i].length - 1) {
            System.out.println("Direita: " + mat[i][j + 1]);
          }
          if (i < mat.length - 1) {
            System.out.println("Embaixo: " + mat[i + 1][j]);
          }
        }
      }
    }
    sc.close();
  }
}
