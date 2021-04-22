package ar.unrn.tp4.modelo;

public class Apellido {

	private String apellido;

	public Apellido(String apellido) throws CreateException {

		if (apellido.contentEquals(""))
			throw new CreateException("No se pudo agregar el Apellido");

		this.apellido = apellido;
	}

	public String apellido() {

		return this.apellido;
	}
}
