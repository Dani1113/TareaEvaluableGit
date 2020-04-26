package EJERCICIO_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Fichero {

	public static void a�adirAlumno(String fichero, Alumno a1){
		try {
			FileOutputStream ficheroSalida = new FileOutputStream(fichero);
			try {
				ObjectOutputStream datosFicheroSalida = new ObjectOutputStream(ficheroSalida);
				datosFicheroSalida.writeObject(a1);
				datosFicheroSalida.close();
				ficheroSalida.close();
			} catch (IOException e) {
				System.out.println("No puedo escribir el objeto en el fichero");
			}
		} catch (FileNotFoundException e) {
			System.out.println("No puedo crear el fichero");
		}
	}
	
	public static Alumno listarAlumno(String fichero) {
		Alumno a = null;
		try {
			FileInputStream ficheroEntrada = new FileInputStream (fichero);
			try {
				ObjectInputStream datosFicheroEntrada = new ObjectInputStream (ficheroEntrada);
				try {
					a = (Alumno)datosFicheroEntrada.readObject();
				datosFicheroEntrada.close();
				ficheroEntrada.close();
				} catch (ClassNotFoundException e) {
					System.out.println("No se ha podido encontrar la clase producto");
				}
			} catch (IOException e) {
				System.out.println("No se ha podido recuperar el objeto");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
		return a;
	}
	
	public static void mostrarMen�() {
		System.out.println("---ELIGE OPCI�N---");
		System.out.println("OPCI�N 1 -> A�ADIR ALUMNO");
		System.out.println("OPCI�N 2 -> LISTAR ALUMNO");
		System.out.println("OPCI�N 3 -> SALIR");
	}
}
