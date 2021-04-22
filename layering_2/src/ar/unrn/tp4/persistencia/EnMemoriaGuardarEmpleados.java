package ar.unrn.tp4.persistencia;

import java.util.ArrayList;

import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.PersistenciaEmpleados;

public class EnMemoriaGuardarEmpleados implements PersistenciaEmpleados {

	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	@Override
	public void guardarEmpleado(Empleado e) {
		// TODO Auto-generated method stub
		empleados.add(e);
	}

	@Override
	public String recuperarEmpleados() {
		// TODO Auto-generated method stub

		String contenido = "";
	
		for (Empleado e : this.empleados) {

			contenido+= e.toString();
		}

		return contenido;
	}
	
	public boolean existe(Empleado empleado) {
		
		return empleados.contains(empleado);
	}
}