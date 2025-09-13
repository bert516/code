import java.util.Scanner;

public class Boss_Puzzle_03 {
  public static void main(String[] args) {
    String[][] brett = {
      {"3 ","7 ","1 "},
      {"6 ","8 ","2 "},
      {"5 ","4 ","  "}
    };
    int zug_zeile;
    int zug_spalte;
    int leer_zeile = 2;
    int leer_spalte = 2;
    Scanner input = new Scanner(System.in);

    int zeile = 1;
    int spalte = 1;
    boolean finished = false;

    while (!finished) {
      System.out.print(" ");
      for (int i = 0; i < 4; i++) {

        for (int j = 0; j < 3; j++) {
          if (i == 0) {
            System.out.print(" " + spalte);
            spalte++;
          } else {
            // System.out.print("i: " + i + j);
            System.out.print(brett[i-1][j]);
          }
        }
        if (i == 3) {
          System.out.println("");
          zeile = 1;
          spalte = 1;
          continue;
        }
        System.out.println("");
        System.out.print(zeile + " ");
        zeile++;
      }
  
      System.out.println("Zeile und Spalte des zu verschiebenden Feldes (-1 um zu beenden):");
      zug_zeile = input.nextInt() - 1;
      if (zug_zeile == -2) {
        break;
      }
      zug_spalte = input.nextInt() - 1;
      if (zug_spalte == -2) {
        break;
      }

      if (Math.abs(zug_spalte-leer_spalte) > 1 || Math.abs(zug_zeile - leer_zeile) > 1 || Math.abs(zug_spalte-leer_spalte) == 1 && Math.abs(zug_zeile - leer_zeile) == 1 || zug_spalte > 2 || zug_zeile > 2) {
        System.out.println("ungültiger Zug.");
        continue;
      }
      brett[leer_zeile][leer_spalte] = brett[zug_zeile][zug_spalte];
      brett[zug_zeile][zug_spalte] = "  ";
      leer_spalte = zug_spalte;
      leer_zeile = zug_zeile;

      System.out.print(" ");
      for (int i = 0; i < 4; i++) {

        for (int j = 0; j < 3; j++) {
          if (i == 0) {
            System.out.print(" " + spalte);
            spalte++;
          } else {
            // System.out.print("i: " + i + j);
            System.out.print(brett[i-1][j]);
          }
        }
        if (i == 3) {
          System.out.println("");
          zeile = 1;
          spalte = 1;  
          continue;
        }
        System.out.println("");
        System.out.print(zeile + " ");
        zeile++;
      }
        
      boolean gleich = true;
      String[][] solution = {{"1 ", "2 ", "3 "}, {"4 ", "5 ", "6 "}, {"7 ", "8 ", "  "}};
      for (int i = 0; i < 3; i++) {
        for (int j = 0; i < 3; i++) {
          if (brett[i][j] != solution[i][j]) {
            gleich = false;
            break;
          }
        }
      }
      
      if (gleich) {
        System.out.println("fertig.");
        input.close();
        break;
      }
    }
  }
}
