import java.util.Scanner;

public class Modul_01 {
  public static void main(String[] args) {
    System.out.println("Enter a radius:");
    Scanner input = new Scanner(System.in);
    double radius = input.nextDouble();
    input.close();
    final double pi = 3.1415;
    double area = Math.round(pi * radius*radius*100)/100.0;

    System.out.println(area);
    
  }
}


