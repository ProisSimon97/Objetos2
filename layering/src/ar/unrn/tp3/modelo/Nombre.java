package ar.unrn.tp3.modelo;

public class Nombre {

	private String nombre;

	public Nombre(String nombre) throws ValidacionException {

		if (nombre.equals(""))
			throw new ValidacionException("Debe cargar un nombre");

		this.nombre = nombre;
	}

	public String obtenerNombre() {
		return this.nombre;
	}
}