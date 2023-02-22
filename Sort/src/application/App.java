package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class App {
    public static void main(String[] args)  {
        
        List<Product> list = new ArrayList<>();

    
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

//--------------------------- Função Lambda  ---------------------------------
      /*   Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;        

        list.sort(comp); */

//função anonima 
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));  //  maneira mais facil e pratica de se fazer

//----------------------Criando uma classe anonima dentro do programa principal e declarando o metodo de comparaçao aqui mesmos------------------

  /*       Comparator<Product> comp = new Comparator<Product>() {  
            @Override
            public int compare(Product p1, Product p2) {
                
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
            
        };

        list.sort(comp); 
        */
   //-------------------------------------------------------------------------------------------------------------------------------------------------------
   
   
       // list.sort(new MyComparator());  usando uma outra classe para fazer a comparação 

        for ( Product p : list) {
            System.out.println(p);
            
        }
    }
}
