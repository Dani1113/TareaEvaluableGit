package EJERCICIO_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Fichero {

	public static void encriptarFichero(String ficheroDescifrado, String ficheroCifrado) {
		try {
			FileReader entrada = new FileReader(ficheroDescifrado);
			BufferedReader miBuffer = new BufferedReader(entrada);
			FileWriter salida = new FileWriter (ficheroCifrado, false);
			BufferedWriter miBuffer2 = new BufferedWriter(salida);
			String linea = "";
			String lineacifrada = "";
			while((linea = miBuffer.readLine()) != null) {
					lineacifrada ="";
					for(int i = 0; i < linea.length() ; i++)
					{
						char letra = (char) (linea.charAt(i) + 3);
						lineacifrada = lineacifrada + String.valueOf(letra);
					}
					lineacifrada = lineacifrada + "\n"; // salto de linea 
					miBuffer2.write(lineacifrada);

				}
				miBuffer.close();
				entrada.close();
				miBuffer2.close();
				salida.close();
			} catch (IOException e) {
				System.out.println("Línea no leída");
			}
	}
	
	public static void desencriptarFichero(String ficheroCifrado, String ficheroDescifrado) {
		try {
			FileReader entrada = new FileReader(ficheroCifrado);
			BufferedReader miBuffer = new BufferedReader(entrada);
			FileWriter salida = new FileWriter (ficheroDescifrado, false);
			BufferedWriter miBuffer2 = new BufferedWriter(salida);
			String linea = "";
			String lineadescifrada = "";
			while((linea = miBuffer.readLine()) != null) {
					lineadescifrada ="";
					for(int i = 0; i < linea.length() ; i++)
					{
						char letra = (char) (linea.charAt(i) - 3);
						lineadescifrada = lineadescifrada + String.valueOf(letra);
					}
					lineadescifrada = lineadescifrada + "\n"; // salto de linea 
					miBuffer2.write(lineadescifrada);

				}
				miBuffer.close();
				entrada.close();
				miBuffer2.close();
				salida.close();
			} catch (IOException e) {
				System.out.println("Línea no leída");
		}
	}
}