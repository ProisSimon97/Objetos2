package ar.unrn.tp5.modelo;

public class CalculadorNoJubilado extends Calculador {

	public CalculadorNoJubilado(int mesEnPromocion) {

		super(mesEnPromocion);
	}

	@Override
	protected double mesConPromocion() {
		// TODO Auto-generated method stub
		return 0.15;
	}

	@Override
	protected double mesSinPromocion() {
		// TODO Auto-generated method stub
		return 0.21;
	}
}