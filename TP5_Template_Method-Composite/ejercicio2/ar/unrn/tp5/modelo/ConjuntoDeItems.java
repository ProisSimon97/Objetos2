package ar.unrn.tp5.modelo;

import java.util.ArrayList;
import java.util.List;

public class ConjuntoDeItems implements Item {

	private List<Item> tareas;
	private int puntosDeHistoria;
	private String nombre;
	private String tipo;

	public ConjuntoDeItems(int puntos, String nombre, String tipo) {

		this.puntosDeHistoria = puntos;
		this.tipo = tipo;
		this.nombre = nombre;
		this.tareas = new ArrayList<Item>();
	}

	@Override
	public int calcularTiempo() {
		// TODO Auto-generated method stub

		int tiempo = this.puntosDeHistoria;

		for (Item tarea : tareas) {

			tiempo += tarea.puntosDeHistoria();
		}

		return tiempo;
	}

	@Override
	public void agregarTarea(Item item) {
		// TODO Auto-generated method stub
		this.tareas.add(item);
	}

	@Override
	public int puntosDeHistoria() {
		// TODO Auto-generated method stub
		return this.puntosDeHistoria;
	}
}
