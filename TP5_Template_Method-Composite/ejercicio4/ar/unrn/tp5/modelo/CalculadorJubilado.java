package ar.unrn.tp5.modelo;

public class CalculadorJubilado extends Calculador {

	public CalculadorJubilado(int mesEnPromocion) {

		super(mesEnPromocion);
	}

	@Override
	protected double mesConPromocion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected double mesSinPromocion() {
		// TODO Auto-generated method stub
		return 0.1;
	}
}