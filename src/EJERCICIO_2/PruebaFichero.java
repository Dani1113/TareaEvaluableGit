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
				System.out.println("Dame la ruta origen del fichero");
				System.out.println("Ejemplo: C:\\Users\\Dani\\Desktop\\FOTO.jpg");
				String ruta_origen = teclado.nextLine();
				System.out.println("Dame la ruta del destino donde quieras copiar el fichero y especifica en ella el nuevo nombre del mismo");
				System.out.println("Ejemplo: C:\\Users\\Dani\\Desktop\\COPIA_FOTO.jpg");
				String ruta_destino = teclado.nextLine();
				System.out.println("Copiando fichero...");
				Fichero.copiarFichero(ruta_origen, ruta_destino);
				break;
			case 2:
				System.out.println("Dame la ruta del fichero que quieres borrar");
				System.out.println("Ejemplo: C:\\Users\\Dani\\Desktop\\FOTO.jpg");
				String ruta_borrar = teclado.nextLine();
				System.out.println("Borrando fichero...");
				Fichero.borrarFichero(ruta_borrar);
				break;
			case 3:
				System.out.println("Dame la ruta origen del fichero del que quieres ver el tamaño");
				System.out.println("Ejemplo: C:\\Users\\Dani\\Desktop\\FOTO.jpg");
				String ruta_tamaño = teclado.nextLine();
				System.out.println("Contando el número de bytes del fichero...");
				int[] cantidadBytes = Fichero.mostrarTamaño(ruta_tamaño);
				break;
			case 4:
				System.out.println("¡Que tenga un buen día!");
				return;
			default:
				System.out.println("Opción incorrecta, inténtalo de nuevo");
				break;
			}
		}while(opcion != 4);
		teclado.close();
	}
}