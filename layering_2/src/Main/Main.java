package Main;

import java.time.LocalDate;

import ar.unrn.tp4.libreria.EnvioEmail;
import ar.unrn.tp4.libreria.RepositorioDeEmails;
import ar.unrn.tp4.modelo.Cumpleaños;
import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.EnvioCorreoElectronico;
import ar.unrn.tp4.modelo.PersistenciaEmpleados;
import ar.unrn.tp4.persistencia.EnDiscoGuardarEmpleados;

public class Main {
	public static void main(String[] args) {

		PersistenciaEmpleados persistencia = new EnDiscoGuardarEmpleados(
				"C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\archivo_prueba2.txt");
		EnvioCorreoElectronico envio = new EnvioEmail(new RepositorioDeEmails());

		try {
			Empleado empleado1 = new Empleado("Preuss", "Simon", LocalDate.of(1997, 04, 23), "simon@gmail");
			Empleado empleado2 = new Empleado("Chubut", "Ana", LocalDate.of(2000, 12, 9), "ana@gmail");

			persistencia.guardarEmpleado(empleado1);
			persistencia.guardarEmpleado(empleado2);

			Cumpleaños cum = new Cumpleaños(persistencia, envio);

			cum.enviarEmailACumpleañeros();
			
			LocalDate hou = LocalDate.now();
			
			
			System.out.println(hou.getDayOfWeek());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
