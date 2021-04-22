package ar.unrn.tp4.modelo;

public class Nombre {

	private String nombre;

	public Nombre(String nombre) throws CreateException {

		if (nombre.contentEquals(""))
			throw new CreateException("No se pudo agregar el Nombre");

		this.nombre = nombre;
	}

	public String nombre() {

		return this.nombre;
	}

}
