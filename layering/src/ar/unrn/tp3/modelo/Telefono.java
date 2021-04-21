package ar.unrn.tp3.modelo;

public class Telefono {

	private String telefono;

	public Telefono(String telefono) throws ValidacionException {

		if (telefono.equals(""))
			throw new ValidacionException("Debe cargar un telefono");

		if (!validarTelefono(telefono))
			throw new ValidacionException("El teléfono debe ingresarse de la siguiente forma: NNNN-NNNNNN");

		this.telefono = telefono;
	}

	public String obtenerTelefono() {
		return this.telefono;
	}

	private boolean validarTelefono(String telefono) {
		String regex = "\\d{4}-\\d{6}";
		return telefono.matches(regex);
	}
}