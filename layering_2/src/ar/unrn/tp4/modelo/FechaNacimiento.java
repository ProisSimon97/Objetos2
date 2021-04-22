package ar.unrn.tp4.modelo;

public class FechaNacimiento {

	private String fechaNacimiento;

	public FechaNacimiento(String nacimiento) throws CreateException {

		if (nacimiento.contentEquals(""))
			throw new CreateException("No se pudo agregar la Fecha de Nacimiento");

		this.fechaNacimiento = nacimiento;
	}

	public String fechaNacimiento() {

		return this.fechaNacimiento;
	}
}
