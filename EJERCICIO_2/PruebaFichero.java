package EJERCICIO_2;

import java.util.Scanner;

public class PruebaFichero {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner teclado = new Scanner (System.in);
		do {
			Fichero.mostrarMenú();
			opcion = teclado.nextInt();
			teclado.nextLine();
			switch (opcion){
			case 1:
				System.out.println("Dame la ruta del fichero");
				String ruta_origen = teclado.nextLine();
				System.out.println("Dame la ruta del sitio donde quieras copiar el fichero y especifica en ella el nuevo nombre del mismo");
				String ruta_destino = teclado.nextLine();
				System.out.println("Copiando archivo...");
				Fichero.copiarFichero(ruta_origen, ruta_destino);
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Opción incorrecta, inténtalo de nuevo");
				break;
			}
		}while(opcion != 3);
	}
}