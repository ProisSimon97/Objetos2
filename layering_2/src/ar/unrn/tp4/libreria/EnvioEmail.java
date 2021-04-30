package ar.unrn.tp4.libreria;

import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp4.modelo.EnvioCorreoElectronico;

public class EnvioEmail implements EnvioCorreoElectronico {

	public RepositorioDeEmails repositorio;

	public EnvioEmail(RepositorioDeEmails repositorio) {

		this.repositorio = repositorio;
	}

	@Override
	public void enviar(String destinatario, String titulo, String cuerpo) throws Exception {
		// TODO Auto-generated method stub
		Email email = new Email(destinatario, titulo, cuerpo);

		try {
			email.enviar();
			repositorio.guardarMail(email);

		} catch (SmtpException e) {
			// TODO Auto-generated catch block
			throw new Exception("Error al enviar mail");
		}
	}

	@Override
	public List<Object> recuperarEmails(String email) throws Exception {
		// TODO Auto-generated method stub

		List<Email> emails = repositorio.recuperarEmail();
		List<Object> emailsPorPersona = new ArrayList<Object>();

		for (Email e : emails) {

			if (e.destinatarioEmail.contentEquals(email))
				emailsPorPersona.add(e);
		}

		return emailsPorPersona;
	}

	@Override
	public boolean verificarEnvioDeEmail(String email) {

		List<Email> emails = repositorio.recuperarEmail();

		for (Email e : emails) {

			if (e.destinatarioEmail.contentEquals(email))
				return true;
		}

		return false;
	}
}