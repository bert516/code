import java.util.Scanner;

public class Modul_03 {
  public static void main(String[] args) {
    //Eindimensionale arrays:
    // Scanner input = new Scanner(System.in);
    // System.out.println("Wie viele Karten möchten Sie?");
    // int anzahl = input.nextInt();
    // int[] karten = new int[anzahl];
    
    // System.out.println("Gebe " + anzahl + " Kartenwerte ein:");
    // for (int i = 0; i < anzahl; i++) {
    //   int karte = input.nextInt();
    //   karten[i] = karte;

    // }

    // System.out.println("Sie haben eingegeben:");
    // for (int i = 0; i<anzahl; i++ ) {
    //   System.out.println(karten[i]);
    // }
    
    // int Summe = 0;
    // System.out.println("Summe: ");
    // for (int i = 0; i<anzahl; i++) {
    //   Summe += karten[i];
    // }
    // System.out.println(Summe);
    // input.close();

    char[][] brett = new char[5][5];
    for (int i = 0; i < 5; i += 4) {
      for (int j = 0; j < 5; j++) {
        brett[i][j] = 'X';
      }
    }
    brett[1][0] = ' ';
    brett[1][1] = ' ';
    brett[1][2] = ' ';
    brett[1][4] = ' ';
    brett[2][0] = ' ';
    brett[2][1] = ' ';
    brett[2][3] = ' ';
    brett[2][4] = ' ';
    brett[3][0] = ' ';
    brett[3][2] = ' ';
    brett[3][3] = ' ';
    brett[3][4] = ' ';
    brett[1][3] = 'X';
    brett[2][2] = 'X';
    brett[3][1] = 'X';
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(brett[i][j]);
      }
      System.out.println(""); 
    }
  }
} 
