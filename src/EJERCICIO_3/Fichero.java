package EJERCICIO_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Fichero {

	public static void añadirAlumno(String fichero, Alumno a1){
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
}
