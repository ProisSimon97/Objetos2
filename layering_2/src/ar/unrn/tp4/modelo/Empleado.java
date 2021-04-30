package ar.unrn.tp4.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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

	public Empleado(String empleado) throws CreateException {

		String[] split = empleado.split(",");

		this.apellido = new Apellido(split[0]);
		this.nombre = new Nombre(split[1]);
		this.fechaNacimiento = new FechaNacimiento(split[2]);
		this.email = new Email(split[3]);
	}

	public boolean compararFechas(String fechaCumpleaños) {

		LocalDate hoy = LocalDate.parse(this.fechaNacimiento());

		DateTimeFormatter corto = DateTimeFormatter.ofPattern("dd/MM").withLocale(new Locale("es", "ES"));
		String nacimientoCorto = corto.format(hoy);

		return nacimientoCorto.contentEquals(fechaCumpleaños);
	};

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