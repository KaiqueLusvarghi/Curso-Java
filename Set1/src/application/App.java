package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io. IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class App {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ // BufferedReader para ler o caminho do arquivo 

            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while(line != null){

                String[] fields = line.split(" "); //Recortando a String 
                String username = fields[0];     // Instânciando Username
                Date moment = Date.from(Instant.parse(fields[1]));  // Instânciando moment

                set.add(new LogEntry(username, moment));

                line = br.readLine();

            }
            System.out.println(" Total users: " + set.size());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
             
        sc.close();
    }
}
