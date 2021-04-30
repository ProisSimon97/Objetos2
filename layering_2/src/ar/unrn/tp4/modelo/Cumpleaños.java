package ar.unrn.tp4.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

public class Cumplea�os {

	private PersistenciaEmpleados persistencia;
	private EnvioCorreoElectronico envio;

	public Cumplea�os(PersistenciaEmpleados persistencia, EnvioCorreoElectronico envio) {

		this.envio = envio;
		this.persistencia = persistencia;
	}

	public void enviarEmailACumplea�eros() throws Exception {

		String titulo = "Feliz Cumplea�os";

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
