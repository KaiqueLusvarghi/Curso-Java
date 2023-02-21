package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.border.LineBorder;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votes = new LinkedHashMap<>();

        System.out.print(" \n Informar o caminho da Pasta: ");
        String path = sc.nextLine(); 
        System.out.println("\n");

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
            while(line != null){

                String[] fields = line.split(",");
                String name = fields[0];
                int count =Integer.parseInt(fields[1]);

                    if(votes.containsKey(name)){

                        int voteSofar = votes.get(name);
                        votes.put(name, count + voteSofar );
                    }   else{
                        votes.put(name, count);
                    }

                    line = br.readLine();
            }

            for (String key : votes.keySet()) {
                    System.out.println(key + ": " + votes.get(key));
                
            }
            
        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());
           
        }   

            sc.close();
    }
}
