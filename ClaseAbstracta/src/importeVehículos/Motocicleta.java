package importeVehículos;

import java.util.Scanner;

public class Motocicleta extends Vehiculo {
	static Scanner sc = new Scanner(System.in);

	private String casco;
	private double multa = 1.48;

	@Override
	public void datos() {
		System.out.println("Introduce las placas de la motocicleta: ");
		placas = sc.next();

		System.out.println("¿El motociclista tiene casco?: ");
		casco = sc.next().toLowerCase();
		if (casco.equals("si")) {
			importe = 74.00;
			IVA = 11.84;
			System.out.println("La motocicleta con placas: " + placas + " tiene un importe de: $" + importe + " más un IVA de 16% de: $" + IVA + " haciendo un total de: " + (importe + IVA));
		} else if (casco.equals("no")) {
			importe = 74.00 + multa;
			IVA = 11.84;
			System.out.println("Tiene una multa de: $" + multa + " por no usar casco.");
			System.out.println("La motocicleta con placas: " + placas +  "tiene un importe de: $" + importe
					+ "más un IVA de 16% de: $" + IVA + " haciendo un total de: " + (importe + IVA));
		} else {
			System.out.println("La opción elegida es incorrecta.");
		}
	}
}
