package ar.unrn.tp5.modelo;

public class Importada extends Remera {

	public Importada(double precio) {

		super(precio);
	}

	@Override
	public double recargoImpuesto() {
		// TODO Auto-generated method stub
		return 0.03;
	}

	@Override
	public double extra() {
		// TODO Auto-generated method stub
		return 0.05;
	}

	@Override
	public double porcentajeDelComercio() {
		// TODO Auto-generated method stub
		return 0.25;
	}
}
