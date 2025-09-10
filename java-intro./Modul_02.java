import java.util.Scanner;

public class Modul_02 {
  public static void main(String[] args) {
    boolean open = false;
    int versuche = 0;
    do {
      int a, b, c;
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Bitte geben sie den 3 stelligen Pin ein!");
      System.out.print("1. Ziffer: ");
      a = scanner.nextInt();
      System.out.print("2. Ziffer: ");
      b = scanner.nextInt();
      System.out.print("3. Ziffer: ");
      c = scanner.nextInt();
      System.out.println("Sie haben eingegeben: "+a+b+c);
      
      
      if (a == 0 && b == 3 && c == 6) {
        open = true;
        System.out.println("offen");
        scanner.close();
      } else {
        System.out.println("Falscher Pin");
        versuche++;

      }
    } while (!open && versuche < 3);
    
  }
}
