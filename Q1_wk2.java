package lab02;
import java.util.Scanner;

public class Q1_wk2{

  final static double PI = 3.14159;

  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number for radius: ");
      double radius  = input.nextDouble();

      double c_area = radius * radius * PI;

      String result = String.format("%.6f", c_area);
      System.out.println("The area for the circle of radius " + radius + " is " + result);
    input.close();
  }
}