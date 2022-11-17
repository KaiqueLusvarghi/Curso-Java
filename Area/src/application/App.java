package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entitiesEnum.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Shape> list = new ArrayList<>();

    System.out.println("Enter the number of shapes");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println("Shape " + i + " data: ");
      System.out.print("Recantgule or Circle (r/c) ? ");
      char type = sc.next().charAt(0);
      //sc.next();
      System.out.println(" Color (BLACK/BLUE/RED) ? :");
      Color color = Color.valueOf(sc.next());

      if (type == 'r') {
        System.out.println("Width :");
        double width = sc.nextDouble();
        System.out.println("height :");
        double height = sc.nextDouble();
        list.add(new Rectangle(color, width, height));
      } else {
        System.out.println("radius :");
        double radius = sc.nextDouble();
        list.add(new Circle(color, radius));
      }
    }
    System.out.println();
    System.out.println("SHAPE AREAS: ");
    for (Shape shape : list) {
        System.out.printf("%.2f ",shape.area());
        
    }
    sc.close();
  }
}
