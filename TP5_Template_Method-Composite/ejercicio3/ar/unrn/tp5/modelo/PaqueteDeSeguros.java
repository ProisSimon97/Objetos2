package ar.unrn.tp5.modelo;

import java.util.ArrayList;
import java.util.List;

public class PaqueteDeSeguros implements Gestion {

	private List<Gestion> seguros;
	private String nombre;

	public PaqueteDeSeguros(String nombre) {

		this.nombre = nombre;
		this.seguros = new ArrayList<Gestion>();
	}

	@Override
	public double calcularCostoDePaquete() {
		// TODO Auto-generated method stub
		double montoSinDescuento = this.calcularCostoSinDescuento();

		return montoSinDescuento - (montoSinDescuento * (this.contarSeguros() * 0.05));
	}

	@Override
	public void agregarSeguro(Gestion seguro) {
		// TODO Auto-generated method stub
		this.seguros.add(seguro);
	}

	@Override
	public int contarSeguros() {
		// TODO Auto-generated method stub
		int cantidadDeSeguros = 0;

		for (Gestion seguro : seguros) {
			cantidadDeSeguros += seguro.contarSeguros();
		}

		return cantidadDeSeguros;
	}

	@Override
	public double calcularCostoSinDescuento() {
		// TODO Auto-generated method stub
		double monto = 0.0;

		for (Gestion seguro : seguros) {
			monto += seguro.calcularCostoSinDescuento();
		}

		return monto;
	}
	
	
	@Override
	public double calcularCostoConDescuentoDePaqueteDePaquetes() {
		// TODO Auto-generated method stub
		double monto = 0.0;

		for (Gestion seguro : seguros) {
			monto += seguro.calcularCostoDePaquete();
		}

		return monto;
	}
}
