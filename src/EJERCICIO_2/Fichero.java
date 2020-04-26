package EJERCICIO_2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fichero {

	public static void copiarFichero(String ficheroOrigen, String ficheroDestino) {
		try {
			FileInputStream ficheroEntrada = new FileInputStream(ficheroOrigen);
			BufferedInputStream miBufferEntrada = new BufferedInputStream (ficheroEntrada);
			FileOutputStream ficheroSalida = new FileOutputStream(ficheroDestino);
			BufferedOutputStream miBufferSalida = new BufferedOutputStream(ficheroSalida);
			byte miBuffer[] = new byte[256];
			int cantidadBytes = 0;
			try {
				do {
					cantidadBytes = miBufferEntrada.read(miBuffer);
					if(cantidadBytes > 0) {
						miBufferSalida.write(miBuffer, 0, cantidadBytes);
					}
				}while(cantidadBytes > 0);
				miBufferEntrada.close();
				miBufferSalida.close();
				ficheroEntrada.close();
				ficheroSalida.close();
			}catch(IOException e) {
				System.out.println("Error al leer o escribir el fichero");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Alumno no encontrado");
		}
	}
	
	public static void borrarFichero(String fichero) {
		File f = new File(fichero);
		f.delete();   
	}
	
	public static int[] mostrarTama�o(String fichero) {
		File ficheroF = new File(fichero);
		int cantidadDeDatos = (int) ficheroF.length();
		int[] datos = new int[cantidadDeDatos];
		try {
			FileInputStream ficheroEntrada = new FileInputStream(fichero);
			int dato = 0;
			int cont = 0;
			try {
				do {
					dato = ficheroEntrada.read();
					if(dato != -1) {
						datos[cont] = dato;
					}
					cont++;
				}while(dato != -1);
				System.out.println("El fichero tiene " + cont + " bytes");
				ficheroEntrada.close();
			} catch (IOException e) {
				System.out.println("Dato no le�do");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Alumno no le�do");
		}
		return datos;
	}
	
	public static void mostrarMen�() {
		System.out.println("---ELIGE OPCI�N---");
		System.out.println("OPCI�N 1 -> COPIAR FICHERO");
		System.out.println("OPCI�N 2 -> BORRAR FICHERO");
		System.out.println("OPCI�N 3 -> MOSTRAR TAMA�O DEL FICHERO");
		System.out.println("OPCI�N 4 -> SALIR");
	}
}