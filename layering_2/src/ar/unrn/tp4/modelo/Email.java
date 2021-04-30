package ar.unrn.tp4.modelo;

public class Email {

	private String email;

	public Email(String email) throws CreateException {

		if (email.contentEquals(""))
			throw new CreateException("No se pudo agregar el Nombre");

		this.email = email;
	}

	public String email() {

		return this.email;
	}
}
