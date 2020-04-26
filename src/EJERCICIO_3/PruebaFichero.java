package EJERCICIO_3;

import java.util.Scanner;

import EJERCICIO_3.Fichero;

public class PruebaFichero {

	public static void main(String[] args) {
		int opcion = 0;
		Scanner teclado = new Scanner (System.in);
		do {
			Fichero.mostrarMenú();
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("Dame el DNI del alumno");
				String DNI = teclado.nextLine();
				System.out.println("Dame el nombre del alumno");
				String nombre = teclado.nextLine();
				System.out.println("Dame la dirección del alumno");
				String dirección = teclado.nextLine();
				System.out.println("Dame la edad del alumno");
				int edad = teclado.nextInt();
				teclado.nextLine();
				Alumno a1 = new Alumno (DNI, nombre, dirección, edad);
				System.out.println("Dime la ruta del lugar donde quieres que se almacenen los datos del alumno");
				System.out.println("Por ejemplo: C:\\Users\\Dani\\Desktop\\EJEMPLO.dat");
				String ruta_escribir = teclado.nextLine();
				System.out.println("Escribiendo datos...");
				Fichero.añadirAlumno(ruta_escribir, a1);
				break;
			case 2:
				System.out.println("Dime la ruta del lugar donde se encuantra el fichero .dat con la información del alumno");
				System.out.println("Por ejemplo: C:\\Users\\Dani\\Desktop\\EJEMPLO.dat");
				String ruta_leer = teclado.nextLine();
				Alumno a2 = Fichero.listarAlumno(ruta_leer);
				System.out.println("Leyendo datos...");
				a2.mostrarAlumno();
				break;
			case 3:
				System.out.println("¡Que tenga un buen día!");
				return;
			default:
				System.out.println();
				break;
			}
		}while(opcion != 3);
	}
}