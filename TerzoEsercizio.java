import java.util.Scanner;

public class TerzoEsercizio {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Quanti anni hai? ");
		float età = Float.parseFloat(in.nextLine());
		System.out.print("Che giorno è oggi? ");
		String giorno=in.nextLine();
		int costo = 0;
		int sconto = 0;
		if (età < 7) {
			costo = 0;
		} else if (età >= 7 && età < 15) {
			costo = 6;
		} else if (età >= 15) {
			costo = 10;
		}
		
		if(giorno.equals("Mercoledì")) {
			sconto = costo-(costo/10);
		} else {
		sconto = costo;
		
		}
		
		
		
		System.out.println("Pagherai il biglietto "+sconto+" euro! ");
		in.close();

	}

}
