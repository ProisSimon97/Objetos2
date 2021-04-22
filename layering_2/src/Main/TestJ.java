package Main;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.time.LocalDate;

import org.junit.Test;

import ar.unrn.tp4.libreria.EnvioEmail;
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

	public void envioDeEmailTest() {

		EnvioCorreoElectronico envioEmail = new EnvioEmail();

		assertDoesNotThrow(() -> envioEmail.enviar("Simon", "Aviso Final", "Ultimo aviso para retirar su tarjeta"));
	}
	
	@Test 
	
	public void recuperarEmpleadosTest() {
		
		PersistenciaEmpleados persistencia = new EnMemoriaGuardarEmpleados();
		
		String empleados = persistencia.recuperarEmpleados();
		
		assertNotNull(empleados);
	}
}