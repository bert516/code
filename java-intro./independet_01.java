import java.util.Scanner;

public class Independet_01 {
  public static void main(String[] args) {
    /* Anhalteweg Rechner:
    System.out.println("Geschwindigkeit: ");
    Scanner input = new Scanner(System.in);
    double speed = input.nextDouble();

    double Reaktionsweg = 3 * speed/10;
    double Bremsweg = speed/10 * speed/10;
    double Anhalteweg = Reaktionsweg + Bremsweg;

    System.out.println("Reaktionsweg: " + Reaktionsweg + "m\nBremsweg: " + Bremsweg + "m\nAnhalteweg: " + Anhalteweg + "m");
    */

    /* Zinseszins Rechner:
    System.out.println("Geldmenge und Zinssatz angeben:");
    Scanner input = new Scanner(System.in);

    double Balance = input.nextDouble();
    double interest = input.nextDouble();
    input.close();

    for (int i = 1; i <= 10; i++) {
      double profit = Math.round(Balance * interest * 100)/100.0;
      Balance += profit;
      Balance = Math.round(Balance * 100) /100.0;
      System.out.println("Im " + i + ". Jahr gibt es " + profit + " CHF Zins. Neuer Kontostand: " + Balance);
    }
    */

    System.out.println("WILLKOMMEN BEI DER BANK IHRES VERTRAUENS\n" + 
        "**************************************** \nWie viel möchten Sie abheben?");
    Scanner input = new Scanner(System.in);
    int amount = input.nextInt();
    input.close();
    System.out.println("Eingegebener Geldbetrag:" + amount + " CHF");
    if (amount > 1000) {
      System.out.println("Betrag übersteigt den Maximalbetrag von 1000 CHF.");
    } else {
      int original = amount;
      int hunni = amount/100;
      amount %= 100;
      int fuffi = amount/50;
      amount %= 50;
      int zwanni = amount/20;
      amount %= 20;
      int zehner = amount/10;
      amount %= 10;
      int Rest = amount;
      if (Rest != 0) {
        System.out.println("Der Betrag wurde auf " + (original-amount) + " CHF abgerundet.");
      }
      System.out.println("100er: " + hunni + "\n50er: " + fuffi + "\n20er: " + zwanni + "\n10er: " + zehner + "\nRest: " + Rest);
    } 
  }
}
