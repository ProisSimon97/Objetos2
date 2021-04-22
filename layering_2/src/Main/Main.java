package Main;

import java.time.LocalDate;

import ar.unrn.tp4.libreria.EnvioEmail;
import ar.unrn.tp4.modelo.CreateException;
import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.EnvioCorreoElectronico;
import ar.unrn.tp4.modelo.PersistenciaEmpleados;
import ar.unrn.tp4.persistencia.EnDiscoGuardarEmpleados;

public class Main {
	public static void main(String[] args) {
		
		PersistenciaEmpleados persistencia = new EnDiscoGuardarEmpleados();
		EnvioCorreoElectronico envioEmail = new EnvioEmail();
		
		try {
			Empleado empleado1 = new Empleado("Preuss", "Simon", LocalDate.of(1997, 04, 07), "simon@gmail");
			Empleado empleado2 = new Empleado("Chubut", "Ana", LocalDate.of(2000, 12, 9), "ana@gmail");
			
			persistencia.guardarEmpleado(empleado1);
			persistencia.guardarEmpleado(empleado2);
			
			String empleados = persistencia.recuperarEmpleados();
			
			if(!empleados.isEmpty()) {
				envioEmail.enviar("Simon", "Aviso Final", "Ultimo aviso para retirar su tarjeta");
				
				System.out.println("pene");
			}
				
			
		} catch (CreateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
