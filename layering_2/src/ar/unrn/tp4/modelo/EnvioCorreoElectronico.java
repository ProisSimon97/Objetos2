package ar.unrn.tp4.modelo;

import java.util.List;

public interface EnvioCorreoElectronico {

	public void enviar(String destinatiario, String titulo, String cuerpo) throws Exception;

	public List<Object> recuperarEmails(String email) throws Exception;

	public boolean verificarEnvioDeEmail(String email);
}
