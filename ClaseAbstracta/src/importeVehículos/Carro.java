package importeVehículos;

import java.util.Scanner;

public class Carro extends Vehiculo{
	static Scanner sc = new Scanner(System.in);

	@Override
	public void datos() {
		
		
		importe = 107.50;
		IVA = 17.2;
		System.out.println("Introduce las placas del carro: ");
		placas = sc.next();
		
		System.out.println("El carro con placas: " + placas + " tiene un importe de: $" + importe + " más un IVA de 16% de: $" + IVA + " haciendo un total de: " + (importe + IVA));
		
		
		
		
	}
}
