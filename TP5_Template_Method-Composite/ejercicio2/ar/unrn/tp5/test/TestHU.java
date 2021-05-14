package ar.unrn.tp5.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unrn.tp5.modelo.ConjuntoDeItems;
import ar.unrn.tp5.modelo.Item;
import ar.unrn.tp5.modelo.Tarea;

public class TestHU {

	@Test

	public void calcularPuntosDeEsfuerzoParaUnProyectoTest() {

		Item proyecto = new ConjuntoDeItems(0, "Sistema", "");

		Item historiaDeUsuario = new ConjuntoDeItems(13, "Agregar Empleado", "Spike");

		Item tarea1 = new Tarea("Investigacion");
		Item tarea2 = new Tarea("Funcionalidad");

		historiaDeUsuario.agregarTarea(tarea1);
		historiaDeUsuario.agregarTarea(tarea2);

		Item historiaDeUsuario2 = new ConjuntoDeItems(8, "Eliminar Empleador", "HU");

		Item tarea3 = new Tarea("Funcionalidad");
		Item tarea4 = new Tarea("Funcionalidad");

		historiaDeUsuario2.agregarTarea(tarea3);
		historiaDeUsuario2.agregarTarea(tarea4);

		proyecto.agregarTarea(historiaDeUsuario);
		proyecto.agregarTarea(historiaDeUsuario2);

		assertEquals(21, proyecto.calcularTiempo());
	}
}
