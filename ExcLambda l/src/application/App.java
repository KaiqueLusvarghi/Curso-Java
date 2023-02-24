package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employees;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Entre com o nome inteiro do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Employees> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employees(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            System.out.println("Entre com um salario: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream().filter(x -> x.getSalary() > salary).map(x -> x.getEmail()).sorted()
                    .collect(Collectors.toList());

            System.out.println("Email das pessoas cujo salario é maior que " + String.format("%.2f", salary) + " : ");
            emails.forEach(System.out::println);
            double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0,
                    (x, y) -> x + y);

            System.out.println("Soma do salário de pessoas cujo nome começa com 'M' " + String.format("5.2f", sum));
        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());

        }
        sc.close();
    }
}
