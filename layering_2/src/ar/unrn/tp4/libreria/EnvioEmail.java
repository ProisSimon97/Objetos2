package ar.unrn.tp4.libreria;

import ar.unrn.tp4.modelo.EnvioCorreoElectronico;

public class EnvioEmail implements EnvioCorreoElectronico {

	@Override
	public void enviar(String destinatario, String titulo, String cuerpo) {
		// TODO Auto-generated method stub
		Email email = new Email(destinatario, titulo, cuerpo);

		try {
			email.enviar();
		} catch (SmtpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
