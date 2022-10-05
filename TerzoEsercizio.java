import java.util.Scanner;

public class TerzoEsercizio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Quanti anni hai? ");
		int età = in.nextInt();
		int costo = 0;
		if (età < 7) {
			costo = 0;
		} else if (età >= 7 && età < 15) {
			costo = 6;
		} else if (età >= 15) {
			costo = 6;
		}
		System.out.println("Pagherai il biglietto "+costo+" euro! ");
		in.close();

	}

}