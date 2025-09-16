
public class Lieferschein_04 {

	public static void main(String[] args) {
		double sum = summe(15.90, 21.90, 32.50);

		System.out.println("Lieferschein");
		line(12, "-");
		System.out.println("Artikel 1		          15.90");
		System.out.println("Artikel 2		          21.90");
		System.out.println("Artikel 3		          32.50");
		line(40, "+");
		System.out.println("Preis total		          " + sum);
		line(40, "*");
	}

	public static void line(int var, String type) {
		for (int i = 0; i < var; i++) {
			System.out.print(type);
		}
		System.out.println();
	}

	public static double summe(double art1, double art2, double art3) {
		return art1 + art2 + art3;
	}
}



