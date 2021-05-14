package ar.unrn.tp5.modelo;

public class Seguro implements Gestion {

	private double costo;
	private String tipoDeSeguro;

	public Seguro(double costo, String tipo) {

		this.costo = costo;
		this.tipoDeSeguro = tipo;
	}

	@Override
	public double calcularCostoDePaquete() {
		// TODO Auto-generated method stub
		return this.costo;
	}

	@Override
	public void agregarSeguro(Gestion seguro) {
		// TODO Auto-generated method stub
		System.out.println("No se pudo agregar el seguro");
	}

	@Override
	public int contarSeguros() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public double calcularCostoSinDescuento() {
		// TODO Auto-generated method stub
		return this.costo;
	}

	@Override
	public double calcularCostoConDescuentoDePaqueteDePaquetes() {
		// TODO Auto-generated method stub
		return 0;
	}
}
