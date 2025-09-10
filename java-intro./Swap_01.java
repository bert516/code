import java.util.Scanner;

public class Swap_01 {
  public static void main(String[] args) {
    String a;
    String b;
    
    System.out.println("names:");
    Scanner input = new Scanner(System.in);
    a = input.next();
    b = input.next();
    input.close();
    String c = a;
    a = b;
    b = c;
    System.out.println(a + " und " + b);
  }
}
