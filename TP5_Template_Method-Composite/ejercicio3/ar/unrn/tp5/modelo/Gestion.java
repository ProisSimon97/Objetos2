package ar.unrn.tp5.modelo;

public interface Gestion {

	public double calcularCostoDePaquete();

	public void agregarSeguro(Gestion seguro);
	
	public int contarSeguros();
	
	public double calcularCostoSinDescuento();

	double calcularCostoConDescuentoDePaqueteDePaquetes();

}
