package ar.unrn.tp4.modelo;

import java.time.LocalDate;

public class Empleado {

	private Apellido apellido;
	private Nombre nombre;
	private FechaNacimiento fechaNacimiento;
	private Email email;

	public Empleado(String apellido, String nombre, LocalDate nacimiento, String email) throws CreateException {

		this.apellido = new Apellido(apellido);
		this.nombre = new Nombre(nombre);
		this.fechaNacimiento = new FechaNacimiento(nacimiento.toString());
		this.email = new Email(email);
	}

	public String apellido() {

		return this.apellido.apellido();
	}

	public String nombre() {

		return this.nombre.nombre();
	}

	public String fechaNacimiento() {

		return this.fechaNacimiento.fechaNacimiento();
	}

	public String email() {

		return this.email.email();
	}
}