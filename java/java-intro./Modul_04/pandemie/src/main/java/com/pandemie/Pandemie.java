package com.pandemie;

import terminal.VT;
import terminal.VTerm;

public class Pandemie {
    // globale Matrix für das Speichern der Population
    static int[][] population = new int[21][51];
    static VTerm console = VTerm.getInstance(25, 80, "Pandemie", VT.CS_TINY);

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // console.println("Simulationsdauer und Ansteckungswahrscheinlichkeit in Prozent angeben");
        // int dauer = input.nextInt();
        // double wkeit = input.nextInt()/100.0;
        // input.close();

        int i = 0;
        int j = 0; // Laufvariablen für die Schleifen
        // Die Werte im Array population werden auf 0 gesetzt
        for (i = 0; i< 21; i++) {
            for (j = 0; j< 51; j++) {
                population[i][j] = 0;
            }
        }

        // Ausgabe im Fenster von console (Typ VTerm)
        print();

        console.delay(500); // Warten für 500 Millisekunden
        // erste Person soll angesteckt werden
        init();

        ansteckung(i, j);

        // schliessen der Konsole mit Enter
        console.readyToExit(true);
    }

    /* Hinzufügen der neuen Methoden */

    public static void print() {
        for (int i = 0; i< 21; i++) {
            for (int j = 0; j< 51; j++) {
                if (population[i][j] >0) {
                    console.print("" + population[i][j]);
                } else {
                    console.print(' ');
                }
            }
            console.println();
        }
    }

    public static void ansteckung(int x,int  y) {
        for (int tage = 0; tage< 25; tage++) {
            double probability = Math.round(Math.max(0.05, 0.3 - tage * 0.01)*100)/100.0;
            int infected = 0;
            int healthy = 0;
            int cured = 0;
            for (x = 1; x< 20; x++) {
                for (y = 1; y< 50; y++) {
                    // Berechnung der Ansteckung
                    if (population[x][y] == 0) {
                        int count = (infectioes(x-1, y) ? 1 : 0) + (infectioes(x+1, y) ? 1 : 0) + (infectioes(x, y-1) ? 1 : 0) + (infectioes(x, y+1) ? 1 : 0);
                        if (count > 0) {
                            if (Math.random() < probability * count * 0.5) {
                                population[x][y] = 1;
                            } else {
                                healthy++;
                            }
                            System.out.println("prob: " + probability*count*0.25);
                        }
                    } else if (infectioes(x, y)) {
                        infected++;
                        population[x][y]++;
                    } else if (population[x][y] > 7) {
                        cured++;
                    }

                }
            }

            console.clearScreen(); // Löschen des Inhalts von console
            console.println("Tag " + tage);
            // console.println("Simulationsschritt: " + tage);
            // console.println("noch nicht erkrankte Personen: " + healthy);
            // console.println("erkrankte Personen: " + infected);
            // console.println("geheilte Personen: " + cured);

            // Ausgabe im Fenster von console (Typ VTerm)
            print();
            console.delay(500);
        }
    }
    public static void init() {
        for (int i = 0; i < 3; i++) {
            int y = (int) Math.round(Math.random()*51);
            int x = (int) Math.round(Math.random()*21);
            population[x][y] = 1;
        }
    }

    public static boolean infectioes(int x, int y) {
        return population[x][y] > 0 && population[x][y] < 8;
    }
}