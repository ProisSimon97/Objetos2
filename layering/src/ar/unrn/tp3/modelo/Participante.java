package ar.unrn.tp3.modelo;

public class Participante {

	private Nombre nombre;
	private Telefono telefono;
	private Region region;

	public Participante(String nombre, String telefono, String region) throws ValidacionException {

		this.nombre = new Nombre(nombre);
		this.telefono = new Telefono(telefono);
		this.region = new Region(region);
	}

	public String nombre() {

		return this.nombre.obtenerNombre();
	}

	public String telefono() {

		return this.telefono.obtenerTelefono();
	}

	public String region() {

		return this.region.obtenerRegion();
	}
}