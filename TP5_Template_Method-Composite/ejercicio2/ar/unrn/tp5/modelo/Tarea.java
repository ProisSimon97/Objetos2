package ar.unrn.tp5.modelo;

public class Tarea implements Item {

	private String tipoDeTarea;

	public Tarea(String tipo) {

		this.tipoDeTarea = tipo;
	}

	@Override
	public int calcularTiempo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void agregarTarea(Item item) {
		// TODO Auto-generated method stub
		System.out.println("No se pudo agregar el item.");
	}

	@Override
	public int puntosDeHistoria() {
		// TODO Auto-generated method stub
		return 0;
	}
}
