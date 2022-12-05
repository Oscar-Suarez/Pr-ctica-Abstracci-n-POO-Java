package Main;

import java.util.Scanner;

import importeVehículos.Camion;
import importeVehículos.Carro;
import importeVehículos.Motocicleta;

public class MainMultas {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Motocicleta moto1 = new Motocicleta();
		Carro carro1 = new Carro();
		Camion camion1 = new Camion();
		int opcion;
		int repeticiones = 0;
		
		do {
			System.out.println("Menú:\n Introduzca 1 para la sección motocicletas.\n Introduzca 2 para la sección de carros.\n Introduzca 3 para la sección de caminoes.\n Introduzca cualquier otro número entero para salir.");
			opcion = sc.nextInt();
			if (opcion == 1) {
			System.out.println("Estás en la sección de motocicletas. \n");
			
			moto1.datos();

			System.out.println("Opciones:\nPresiona 1 para reiniciar el programa.\nPresiona cualquier otro número para salir del programa.");
			repeticiones = sc.nextInt();
			

		}else if (opcion == 2) {
			System.out.println("Estás en la sección de carros. \n");
			
			carro1.datos();

			System.out.println("Opciones:\nPresiona 1 para reiniciar el programa.\nPresiona cualquier otro número para salir del programa.");
			repeticiones = sc.nextInt();
			
		}else if (opcion == 3) {
			System.out.println("Estás en la sección de camiones.\n");
			camion1.datos();
			System.out.println("Opciones:\nPresiona 1 para reiniciar el programa.\nPresiona cualquier otro número para salir del programa.");
			repeticiones = sc.nextInt();
		}else {
			System.out.println("Ha salido del programa.");
		}}while (repeticiones == 1);
		
		System.out.println("Gracias por usar el programa de importes.");

	}

}
