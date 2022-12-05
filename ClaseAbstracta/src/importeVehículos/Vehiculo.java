package importeVehículos;

import java.util.Scanner;

abstract class Vehiculo {
	static Scanner sc = new Scanner(System.in);
	
	protected String placas;
	protected double importe;
	protected double IVA;
	protected abstract void datos();
	

	
}
