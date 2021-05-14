package ar.unrn.tp5.test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import ar.unrn.tp5.modelo.Calculador;
import ar.unrn.tp5.modelo.CalculadorJubilado;
import ar.unrn.tp5.modelo.CalculadorNoJubilado;

public class TestJubilados {

	@Test

	public void calcularPrecioDeJubiladoConPromocionTest() {

		Calculador calculadorConPromo = new CalculadorJubilado(LocalDate.now().getMonth().getValue());

		double monto = calculadorConPromo.calcularPrecio(50);

		assertEquals(50.0, monto, 0.1);
	}

	@Test

	public void calcularPrecioDeJubiladoSinPromocionTest() {

		Calculador calculadorConPromo = new CalculadorJubilado(LocalDate.now().getMonth().getValue() - 1);

		double monto = calculadorConPromo.calcularPrecio(50);

		assertEquals(55.0, monto, 0.1);
	}

	@Test

	public void calcularPrecioDeNoJubiladoConPromocionTest() {

		Calculador calculadorConPromo = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue());

		double monto = calculadorConPromo.calcularPrecio(50);

		assertEquals(57.5, monto, 0.1);
	}

	@Test

	public void calcularPrecioDeNoJubiladoSinPromocionTest() {

		Calculador calculadorConPromo = new CalculadorNoJubilado(LocalDate.now().getMonth().getValue() - 3);

		double monto = calculadorConPromo.calcularPrecio(50);

		assertEquals(60.5, monto, 0.1);
	}
}
