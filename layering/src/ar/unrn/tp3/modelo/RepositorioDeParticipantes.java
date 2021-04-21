package ar.unrn.tp3.modelo;

public interface RepositorioDeParticipantes {

	void guardarParticipante(String nombre, String telefono, String region) throws ValidacionException;

	void setUpBaseDatos() throws ValidacionException;
}