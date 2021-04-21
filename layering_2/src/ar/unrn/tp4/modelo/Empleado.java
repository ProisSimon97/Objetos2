package ar.unrn.tp4.modelo;

import java.util.Date;

public class Empleado {

	private String apellido;
	private String nombre;
	private Date fechaNacimiento;
	private String email;
	
	public Empleado(String apellido, String nombre, Date fechaNacimiento, String email) {
		
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}
}
