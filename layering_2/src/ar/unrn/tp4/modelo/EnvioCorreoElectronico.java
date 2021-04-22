package ar.unrn.tp4.modelo;

public interface EnvioCorreoElectronico {

	public void enviar(String destinatiario, String titulo, String cuerpo);
}
