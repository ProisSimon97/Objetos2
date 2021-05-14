package ar.unrn.tp5.modelo;

public class Regular implements Empleado {

	private String nombre;
	private Double salario;
	private String cargo;

	public Regular(String nombre, Double salario) {

		this.nombre = nombre;
		this.salario = salario;
		this.cargo = "Regular";
	}

	@Override
	public Double calcularMonto() {
		// TODO Auto-generated method stub
		return this.salario;
	}

	@Override
	public void agregarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		System.out.println("No se pudo agregar un empleado.");
	}

	@Override
	public Double montoDeEmpleado() {
		// TODO Auto-generated method stub
		return this.salario;
	}
}
