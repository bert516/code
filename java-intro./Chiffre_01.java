import java.util.Scanner;

public class Chiffre_01 {
  public static void main(String[] args) {

    System.out.println("String and key to Encipher");
    String code;
    int key;
    String result = "";
    //get input
    Scanner input = new Scanner(System.in);
    code = input.next();
    key = input.nextInt();
    input.close();

    //print characters separately
    for (int i = 0; i < code.length(); i++) {
      char buchstabe = code.charAt(i);
      int ordnungszahl = (int) buchstabe;
      int encipherer = ordnungszahl - key;
      char enciphered = (char) encipherer;
      result += enciphered;
    }
    System.out.println("Eingabe: " + code + "\n" + "Ausgabe: " + result);
  }

}
