package ar.unrn.tp4.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Cumpleaños {

	private PersistenciaEmpleados persistencia;
	private EnvioCorreoElectronico envio;

	public Cumpleaños(PersistenciaEmpleados persistencia, EnvioCorreoElectronico envio) {

		this.envio = envio;
		this.persistencia = persistencia;
	}

	public void enviarEmailACumpleañeros() throws Exception {

		String titulo = "Feliz Cumpleaños";

		DateTimeFormatter corto = DateTimeFormatter.ofPattern("dd/MM").withLocale(new Locale("es", "ES"));
		String hoy = corto.format(LocalDate.now());

		List<Empleado> empleados = persistencia.recuperarEmpleados();

		for (Empleado empleado : empleados) {

			if (empleado.compararFechas(hoy)) {
				envio.enviar(empleado.email(), titulo, titulo + empleado.nombre());
			}
		}
	}
}
