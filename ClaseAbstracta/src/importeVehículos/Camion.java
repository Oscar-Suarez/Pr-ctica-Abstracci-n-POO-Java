package importeVehículos;

import java.util.Scanner;

public class Camion extends Vehiculo {
	static Scanner sc = new Scanner(System.in);

	@Override
	public void datos() {
		importe = 125.00;
		IVA = 20.00;
		double toneladas = 0;
		double precioTonelada = 15.50;
		double precioTotalToneladas = toneladas + precioTonelada;
		System.out.println("Introduce las placas del camión: ");
		placas = sc.next();
		System.out.println("¿Cuántas toneladas tiene el camión?: ");
		toneladas = sc.nextDouble();
		System.out.println("El camión con placas: " + placas + " tiene un importe de: $" + importe + " más un IVA de 16% de: $" + IVA + " y un precio de toneladas de: $" + precioTotalToneladas + " por " + toneladas + " toneladas " + " haciendo un total de: " + (importe + IVA + precioTotalToneladas));
		
	}
}
