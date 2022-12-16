package application;

import java.io.BufferedWriter;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        String[] lines = new String[] { " Good morning", " Good afeternoon", "Good night" };
        String path = "C:\\Users\\alunos\\Desktop\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
