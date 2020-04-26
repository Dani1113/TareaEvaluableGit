package EJERCICIO_3;

import java.io.Serializable;

public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3778215456590004418L;

	//ATRIBUTOS
	String dni;
	String nombre;
	String direcci�n;
	int edad;
	
	//CONSTRUCTOR
	public Alumno(String dni, String nombre, String direcci�n, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.direcci�n = direcci�n;
		this.edad = edad;
	}
	
	//GETTERS & SETTERS
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//M�TODOS
	public void mostrarAlumno() {
		System.out.println("-DATOS DEL ALUMNO-");
		System.out.println("DNI -> " + this.dni);
		System.out.println("Nombre -> " + this.nombre);
		System.out.println("Direcci�n -> " + this.direcci�n);
		System.out.println("Edad -> " + this.edad);
	}
}
