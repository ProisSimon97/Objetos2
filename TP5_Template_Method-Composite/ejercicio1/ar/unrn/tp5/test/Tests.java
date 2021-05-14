package ar.unrn.tp5.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unrn.tp5.modelo.EmpleadoEncargado;
import ar.unrn.tp5.modelo.Empleado;
import ar.unrn.tp5.modelo.Regular;

public class Tests {

	@Test

	public void calcularMontoTotalSalarialDeLaEmpresaTest() {
		
		Empleado director = new EmpleadoEncargado("Juan Delpo", 1500.0, "Director");

		Empleado gerente = new EmpleadoEncargado("Ana Muja", 1200.0, "Gerente");

		Empleado mandoMedio = new EmpleadoEncargado("Bob Sanchez", 900.0, "Mando Medio");

		Empleado liderDeProyecto = new EmpleadoEncargado("Roger Federer", 550.0, "Lider de Proyecto");

		Empleado regular = new Regular("Emma Stone", 450.0);

		director.agregarEmpleado(gerente);
		gerente.agregarEmpleado(mandoMedio);
		mandoMedio.agregarEmpleado(liderDeProyecto);
		liderDeProyecto.agregarEmpleado(regular);
		
		assertEquals(4600.0, director.calcularMonto(), 0.1);
	}
}
