package EJERCICIO_1;

public class PruebaFichero {

	public static void main(String[] args) {
		Fichero.encriptarFichero("D:\\Dani\\Documentos\\CFGS DAM\\PROGRAMACIÓN\\TEMA 7 TAREA 1 - TEMA 4 ED PRÁCTICA 1\\FICHEROS\\FICHERO.txt", "D:\\Dani\\Documentos\\CFGS DAM\\PROGRAMACIÓN\\TEMA 7 TAREA 1 - TEMA 4 ED PRÁCTICA 1\\FICHEROS\\FICHERO_CIFRADO.txt");		
		Fichero.desencriptarFichero("D:\\Dani\\Documentos\\CFGS DAM\\PROGRAMACIÓN\\TEMA 7 TAREA 1 - TEMA 4 ED PRÁCTICA 1\\FICHEROS\\FICHERO_CIFRADO.txt", "D:\\Dani\\Documentos\\CFGS DAM\\PROGRAMACIÓN\\TEMA 7 TAREA 1 - TEMA 4 ED PRÁCTICA 1\\FICHEROS\\FICHERO_DESCIFRADO.txt" );
	}
}