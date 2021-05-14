package ar.unrn.tp5.modelo;

public abstract class Remera {

	private double precioUnitario;

	public Remera(double precio) {

		this.precioUnitario = precio;
	}

	public double calcularPrecio() {

		double precioFinal = precioUnitario;

		precioFinal += (precioUnitario * this.recargoImpuesto()) + (precioUnitario * this.extra())
				+ (precioUnitario * this.porcentajeDelComercio());

		return precioFinal;
	}

	public abstract double recargoImpuesto();

	public abstract double extra();

	public abstract double porcentajeDelComercio();
}
