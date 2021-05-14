package ar.unrn.tp5.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

	private LogTransaction log;
	private int mesEnPromocion;

	public Calculador(int mesEnPromocion) {

		this.log = new LogTransaction();
		this.mesEnPromocion = mesEnPromocion;
	}

	public double calcularPrecio(double precioProducto) {

		double precioTotal = precioProducto;

		if (of(mesEnPromocion).equals(now().getMonth()))
			precioTotal += precioProducto * this.mesConPromocion();

		else {
			precioTotal += precioProducto * this.mesSinPromocion();
		}

		log.log(this.getClass().getName());

		return precioTotal;
	}

	protected abstract double mesConPromocion();

	protected abstract double mesSinPromocion();
}
