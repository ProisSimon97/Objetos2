package ar.unrn.tp4.persistencia;

import java.util.ArrayList;
import java.util.List;

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
	public List<Empleado> recuperarEmpleados() {
		// TODO Auto-generated method stub

		List<Empleado> empleados = new ArrayList<Empleado>();

		for (Empleado e : this.empleados) {

			empleados.add(e);
		}

		return empleados;
	}

	public boolean existe(Empleado empleado) {

		return empleados.contains(empleado);
	}
}