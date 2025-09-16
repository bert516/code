import java.util.Scanner;

public class Independent_03 {
  public static void main(String[] args) {
    // Bowling Rechner:

    // Scanner input = new Scanner(System.in);
    
    // System.out.println("Spieleranzahl: ");
    // int Spielerzahl = input.nextInt();
    // System.out.println("Rundenanzahl: ");
    // int Rundenzahl = input.nextInt();

    // System.out.println("Punkt angeben:");

    // int[][] resultate = new int[Spielerzahl][Rundenzahl];
    // int[] summe = new int[Spielerzahl];

    // for (int i = 0; i < Rundenzahl; i++) {
    //   System.out.println("Runde: " + (i+1));
    //   for (int j = 0; j < Spielerzahl; j++) {
    //     int punktzahl;
    //     int iteration = 1;
    //     do {
    //       if (iteration > 1) {
    //         System.out.println("ungültige Punktzahl");
    //       }
    //       System.out.print("Punktzahl Spieler " + (j+1) + ":");
    //       punktzahl = input.nextInt();
    //       resultate[j][i] = punktzahl;
    //       iteration++;
    //     } while (punktzahl > 10 || punktzahl < 0);
    //   }
    // }
    // input.close();

    // for (int i = 0; i < Spielerzahl; i++) {
    //   for (int j = 0; j < Rundenzahl; j++) {
    //     summe[i] += resultate[i][j]; 
    //   }
    // }

    // System.out.println("");
    // System.out.println("");
    // System.out.println("          Spieler");

    // System.out.print("        _");
    // for (int i = 0; i < Spielerzahl; i++) {
    //   System.out.print("__");
    // }
    // System.out.println("");

    // System.out.print("          ");
    // for (int i = 0; i < Spielerzahl; i++) {
    //   System.out.print((i+1) + " ");
    // }
    // System.out.println("");

    // System.out.print("_________");
    // for (int i = 0; i < Spielerzahl; i++) {
    //   System.out.print("__");
    // }
    // System.out.println("");

    // for (int i = 0; i < Rundenzahl; i++) {
    //   System.out.print((i + 1)+ ". Runde:");
    //   for (int j = 0; j < Spielerzahl; j++) {
    //     System.out.print(" " + resultate[j][i]);
    //   }
    //   System.out.println("");
    // }

    // System.out.print("_________");
    // for (int i = 0; i < Spielerzahl; i++) {
    //   System.out.print("__");
    // }
    // System.out.println("");

    // System.out.print("Summe:    ");
    // for (int i = 0; i < Spielerzahl; i++) {
    //   System.out.print(summe[i] + " ");
    // }


    // Tic Tac Toe

    // Scanner input = new Scanner(System.in);
    
    // System.out.println("Tic Tac Toe:");

    // String[][] feld = {{"  ", "  ", "  "}, {"  ", "  ", "  "}, {"  ", "  ", "  "}};
    // boolean finished = false;
    // String player = "1 ";
    // int zug = 1;

    // while (!finished) {
    //   System.out.println("Spieler " + player +  " ist dran.");
    //   System.out.print(" ");
    //   for (int i = 0; i < 4; i++) {
    //     if (i == 0) {
    //       System.out.print("1 2 3 ");
    //       System.out.println("");
    //       continue;
    //     }
    //     System.out.print(i);
    //     for (int j = 0; j < 3; j++) {
    //       System.out.print(feld[i-1][j]);
    //     }
    //     System.out.println("");
    //   }

    //   System.out.println("Zeile und Spalte für Zug angeben (-1 um abzubrechen)");
    //   int zug_zeile = input.nextInt() - 1;
    //   int zug_spalte = input.nextInt() - 1;
    //   if (zug_zeile == -2 ||zug_spalte == -2) {
    //     break;
    //   }
    //   if (zug_spalte > 2 || zug_spalte < 0 || zug_zeile > 2 || zug_zeile < 0) {
    //     System.out.println("ungültiger Zug");
    //     continue;
    //   }
    //   if (feld[zug_zeile][zug_spalte] != "  ") {
    //     System.out.println("ungültiger Zug");
    //     continue;
    //   }

    //   feld[zug_zeile][zug_spalte] = (String) player;

    //   if (player == "1 ") {
    //     player = "2 ";
    //   } else {
    //     player = "1 ";
    //   }

    //   if (zug == 9) {
    //     break;
    //   }
    //   zug++;

    //   // horizontale linien
    //   for (int i = 0; i < 3; i++) {
    //     String start = feld[i][0];

    //     if (start == "  ") {
    //       continue;
    //     }

    //     boolean horizontal = true;
    //     for (int j = 0; j < 3; j++) {
    //       if (!feld[i][j].equals(start)) {
    //         horizontal = false;
    //         break;
    //       }
    //     }
    //     if (horizontal) {
    //       finished = true;
    //       break;
    //     }
    //   }

    //   if (finished) {
    //     break;
    //   }

    //   // vertikale linien
    //   for (int i = 0; i < 3; i++) {
    //     String start = feld[0][i];

    //     if (start == "  ") {
    //       continue;
    //     }

    //     boolean vertikal = true;
    //     for (int j = 0; j < 3; j++) {
    //       if (!feld[j][i].equals(start)) {
    //         vertikal = false;
    //         break;
    //       }
    //     }
    //     if (vertikal) {
    //       finished = true;
    //       break;
    //     }
    //   }
      
    //   // diagonale linien
    //   String diagonal1 = feld[0][0];
    //   String diagonal2 = feld[0][2];
    //   boolean diagonal = true;
      
    //   if (finished) {
    //     break;
    //   }

    //   for (int i = 0; i < 3; i++) {
    //     if (!feld[i][2-i].equals(diagonal2)) {
    //       diagonal = false;
    //     }
    //   }

    //   if (diagonal2 == "  ") {
    //     diagonal = false;
    //   }

    //   if (diagonal) {
    //     finished = true;
    //     break;
    //   }

    //   diagonal = true;

    //   for (int i = 0; i < 3; i++) {
    //     if (!feld[i][i].equals(diagonal1)) {
    //       diagonal = false;
    //     }
    //   }
    //   if (diagonal1 == "  ") {
    //     diagonal = false;
    //   }

    //   if (diagonal) {
    //     finished = true;
    //     break;
    //   }
    // }
    

    // System.out.print(" ");
    // for (int i = 0; i < 4; i++) {
    //   if (i == 0) {
    //     System.out.print("1 2 3 ");
    //     System.out.println("");
    //     continue;
    //   }
    //   System.out.print(i);
    //   for (int j = 0; j < 3; j++) {
    //     System.out.print(feld[i-1][j]);
    //   }
    //   System.out.println("");
    // }


    // Suchalgorithmen

    int[] array = {2, 4, 23, 53, 654, 4,12, 45 ,7543, 3332, 5465, 4567,};
    // int[] max = new int[array.length];
    // int[] min = new int[array.length];
    // int max_counter = 1;
    // int min_counter = 1;

    // for (int i = 1; i < array.length; i++) {
    //   if (array[i] > array[max[0]]) {
    //     for (int j= 0; j < array.length; j++) {
    //       max[j] = 0;
    //       max_counter = 1;
    //     }
    //     max[0] = i;
    //   } else if (array[i] == array[max[0]]) {
    //     max[max_counter] = i;
    //     max_counter++;
    //   }

    //   if (array[i] < array[min[0]]) {
    //     for (int j= 0; j < array.length; j++) {
    //       min[j] = 0;
    //       min_counter = 1;
    //     }
    //     min[0] = i;
    //   } else if (array[i] == array[min[0]]) {
    //     min[min_counter] = i;
    //     min_counter++;
    //   }
    // }

    // Bubble-sort

    for (int i = 0; i < array.length; i++) {
      int pointer0 = 0;
      int pointer1 = 1;
      for (int j = 0; j < array.length-i; j++) {
        try {
          if (array[pointer0] > array[pointer1]) {
            int temp = array[pointer1];
            array[pointer1] = array[pointer0];
            array[pointer0] = temp;
          }
        } catch (java.lang.ArrayIndexOutOfBoundsException a) {
          continue;
        }

        pointer0++;
        pointer1++;
        for (int k = 0; k < array.length; k++) {
          System.out.print(array[k] + ", "); 
        }
        System.out.println("");
      }
    }

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ", ");
    }
  }
}