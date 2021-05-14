package ar.unrn.tp5.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unrn.tp5.modelo.Gestion;
import ar.unrn.tp5.modelo.PaqueteDeSeguros;
import ar.unrn.tp5.modelo.Seguro;

public class TestSeguros {

	@Test

	public void calcularPrecioDePaqueteDeSegurosTest() {

		Gestion paquete = new PaqueteDeSeguros("Paquete de seguros variados");

		Gestion seguro1 = new Seguro(100.0, "Automovil");
		Gestion seguro2 = new Seguro(150.0, "Vida");
		Gestion seguro3 = new Seguro(125.0, "Medicos");

		paquete.agregarSeguro(seguro1);
		paquete.agregarSeguro(seguro2);
		paquete.agregarSeguro(seguro3);

		assertEquals(318.75, paquete.calcularCostoDePaquete(), 0.1);
	}

	@Test
	
	public void calcularPrecioDePaqueteDePaqueteDeSegurosTest() {
		
		Gestion paqueteDePaquete = new PaqueteDeSeguros("Paquete de Seguridad Civil");
		Gestion paquete = new PaqueteDeSeguros("Paquete de seguros de Automoviles");
		Gestion paquete2 = new PaqueteDeSeguros("Paquete de seguros Medicos");

		Gestion seguro1 = new Seguro(100.0, "Automovil");
		Gestion seguro2 = new Seguro(150.0, "Automovil");
		Gestion seguro3 = new Seguro(150.0, "Medicos");
		Gestion seguro4 = new Seguro(100.0, "Medicos");

		paquete.agregarSeguro(seguro1);
		paquete.agregarSeguro(seguro2);
		paquete2.agregarSeguro(seguro3);
		paquete2.agregarSeguro(seguro4);
		paqueteDePaquete.agregarSeguro(paquete);
		paqueteDePaquete.agregarSeguro(paquete2);
		
		assertEquals(450.0, paqueteDePaquete.calcularCostoConDescuentoDePaqueteDePaquetes(), 0.1);
	}
}
