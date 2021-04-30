package ar.unrn.tp4.libreria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeEmails {

	List<Email> repositorio = new ArrayList<Email>();

	public void guardarMail(Email email) {

		this.repositorio.add(email);
	}

	public List<Email> recuperarEmail() {

		return this.repositorio;
	}
}
