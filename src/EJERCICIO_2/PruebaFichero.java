package EJERCICIO_2;

import java.util.Scanner;

public class PruebaFichero {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner teclado = new Scanner (System.in);
		do {
			Fichero.mostrarMen�();
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion){
			case 1:
				System.out.println("Dame la ruta origen del fichero");
				String ruta_origen = teclado.nextLine();
				System.out.println("Dame la ruta del destino donde quieras copiar el fichero y especifica en ella el nuevo nombre del mismo");
				String ruta_destino = teclado.nextLine();
				System.out.println("Copiando archivo...");
				Fichero.copiarFichero(ruta_origen, ruta_destino);
				break;
			case 2:
				break;
			case 3:
				System.out.println("Dame la ruta origen del fichero");
				String ruta = teclado.nextLine();
				int[] cantidadBytes = Fichero.mostrarTama�o(ruta);
				break;
			case 4:
				System.out.println("�Que tenga un buen d�a!");
				return;
			default:
				System.out.println("Opci�n incorrecta, int�ntalo de nuevo");
				break;
			}
		}while(opcion != 4);
		teclado.close();
	}
}