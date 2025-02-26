package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.List;
import java.util.ArrayList;


public class Program {
    public static void main(String args[]) {
      
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      List<Shape> list  = new ArrayList<>();
      
      System.out.println("Enter  the  number of shapes: ");
      int n  = sc.nextInt();
      
      for(int i = 1; i <=n; i++){
          System.out.println("Shape #"  + i + "data: ");
          System.out.print("Rectangle or Circle (r/c)? ");
          char ch = sc.next().charAt(0);
            System.out.print("color (BLACK/BLUE/RED): ");
            Color color  = Color.valueOf(sc.next());
            
            if(ch == 'r'){
                System.out.print("width: ");
                Double width = sc.nextDouble();
                System.out.print("height: ");
              Double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
            }
            else{
                  System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
      }
       System.out.println();
        System.out.println("SHAPE AREAS: ");
           for(Shape shape : list){
               System.out.println(String.format("%.2f", shape.area()));
           }
             
      
      sc.close();
    }
}

