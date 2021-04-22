package ar.unrn.tp4.modelo;

public interface PersistenciaEmpleados {
	
	public void guardarEmpleado(Empleado e);
	
	public String recuperarEmpleados();
	
	boolean existe(Empleado empleado);
}
