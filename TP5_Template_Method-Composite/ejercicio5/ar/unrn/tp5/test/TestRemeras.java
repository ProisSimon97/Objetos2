package ar.unrn.tp5.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.unrn.tp5.modelo.Nacional;
import ar.unrn.tp5.modelo.Importada;
import ar.unrn.tp5.modelo.Remera;

public class TestRemeras {

	@Test

	public void precioFinalDeRemeraNacionalTest() {

		Remera remera = new Importada(150.0);

		assertEquals(199.5, remera.calcularPrecio(), 0.1);
	}

	@Test

	public void precioFinalDeRemeraImportadaTest() {

		Remera remera = new Nacional(150.0);
		
		assertEquals(144.75, remera.calcularPrecio(), 0.1);
	}
}
