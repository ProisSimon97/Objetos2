package ar.unrn.tp5.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoEncargado implements Empleado {

	public List<Empleado> empleados;
	private String nombre;
	private Double salario;
	private String cargo;

	public EmpleadoEncargado(String nombre, Double salario, String cargo) {

		this.nombre = nombre;
		this.salario = salario;
		this.cargo = cargo;
		empleados = new ArrayList<Empleado>();
	}

	@Override
	public Double calcularMonto() {
		// TODO Auto-generated method stub

		Double monto = this.montoDeEmpleado();

		for (Empleado empleado : empleados) {
			monto += empleado.calcularMonto();
		}

		return monto;
	}

	@Override
	public void agregarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		this.empleados.add(empleado);
	}

	@Override
	public Double montoDeEmpleado() {
		// TODO Auto-generated method stub
		return this.salario;
	}
}
