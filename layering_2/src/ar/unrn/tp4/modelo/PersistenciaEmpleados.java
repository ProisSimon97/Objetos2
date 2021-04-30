package ar.unrn.tp4.modelo;

import java.util.List;

public interface PersistenciaEmpleados {

	public void guardarEmpleado(Empleado e);

	public List<Empleado> recuperarEmpleados();

	boolean existe(Empleado empleado);
}