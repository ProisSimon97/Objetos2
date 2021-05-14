package ar.unrn.tp5.modelo;

public class Nacional extends Remera {

	public Nacional(double precio) {

		super(precio);
	}

	@Override
	public double recargoImpuesto() {
		// TODO Auto-generated method stub
		return 0.015;
	}

	@Override
	public double extra() {
		// TODO Auto-generated method stub
		return -0.20;
	}

	@Override
	public double porcentajeDelComercio() {
		// TODO Auto-generated method stub
		return 0.15;
	}
}
