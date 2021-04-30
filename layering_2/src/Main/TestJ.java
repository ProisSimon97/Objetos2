package Main;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.Test;

import ar.unrn.tp4.libreria.EnvioEmail;
import ar.unrn.tp4.libreria.RepositorioDeEmails;
import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.EnvioCorreoElectronico;
import ar.unrn.tp4.modelo.PersistenciaEmpleados;
import ar.unrn.tp4.persistencia.EnMemoriaGuardarEmpleados;

public class TestJ {

	@Test

	public void crearEmpleadoTest() {

		assertDoesNotThrow(() -> new Empleado("Preuss", "Simon", LocalDate.of(1997, 12, 9), "simon@gmail"));
	}

	@Test

	public void existenciaDeEmpleadoTest() {

		PersistenciaEmpleados persistencia = new EnMemoriaGuardarEmpleados();

		Empleado empleado = null;
		try {
			empleado = new Empleado("Preuss", "Simon", LocalDate.of(1997, 12, 9), "simon@gmail");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		persistencia.guardarEmpleado(empleado);

		assertTrue(persistencia.existe(empleado));
	}

	@Test

	public void envioDeEmailTest() throws Exception {

		PersistenciaEmpleados persistencia = new EnMemoriaGuardarEmpleados();
		EnvioCorreoElectronico envio = new EnvioEmail(new RepositorioDeEmails());

		Empleado empleado1 = new Empleado("Preuss", "Simon", LocalDate.of(1997, 04, 23), "simon@gmail");

		persistencia.guardarEmpleado(empleado1);

		envio.enviar("simon@gmail", "Feliz Cumple", "Hola, Feliz Cumple");

		assertTrue(envio.verificarEnvioDeEmail("simon@gmail"));
	}
}