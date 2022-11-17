package application;

import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    // declarando o valor de n que sera o valor da matriz bidimensional
    System.out.println("Digite o valor da matrix");
    int n = sc.nextInt();
    int[][] mat = new int[n][n];

    // primeiro for percorrendo as linhas
    for (int i = 0; i < n; i++) {
      //segundo for percorrendo as colunas
      for (int j = 0; j < n; j++) {
        System.out.println("Digite o valor na posição  " + i + "," + j + ": ");
        mat[i][j] = sc.nextInt();
      }
    }
    System.out.println();
 // mostrando os numeros do vetor em suas posições e em forma de tabela 
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print("Posição " + i + "," + j + "= " + mat[i][j] + " ");
    }
    System.out.println();
    }
    // mostrando a diagonal principal 
            System.out.println("Diagonal Principal ");

            for(int i = 0 ; i < n; i ++ ){
            System.out.print(mat [i][i] + ",   ");
            }

            System.out.println("\n");
            int count = 0;
            System.out.println("\n");
            System.out.println("VERIFICANDO SE TEM NUMEROS NEGATIVOS");

            for(int i = 0; i <n; i++){ // poderia trocar (int i = 0; i <n; i++) por (int i = 0; i < mat.length; i++) mesma coisa na coluna J.
                for(int j=0; j<n; j++){
                    if(mat[i][j] < 0){
                        System.out.println(mat[i][j]);
                        count ++;
                    }
                    else {
                       
                    }
                    }
            }
            System.out.println("Tem " + count + "  Numeros negativos na matriz");


    sc.close();
  }
}
