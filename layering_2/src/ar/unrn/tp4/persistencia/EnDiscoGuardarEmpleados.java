package ar.unrn.tp4.persistencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.PersistenciaEmpleados;

public class EnDiscoGuardarEmpleados implements PersistenciaEmpleados {

	private String path;

	public EnDiscoGuardarEmpleados(String path) {

		this.path = path;
	}

	@Override
	public void guardarEmpleado(Empleado e) {
		// TODO Auto-generated method stub

		String empleado = e.apellido() + "," + e.nombre() + "," + e.fechaNacimiento() + "," + e.email() + "\n";

		try {

			Files.write(Paths.get(this.path), empleado.getBytes(), StandardOpenOption.APPEND);

		} catch (IOException ex) {

			throw new RuntimeException("No se pudo persistir");
		}
	}

	@Override
	public List<Empleado> recuperarEmpleados() {
		// TODO Auto-generated method stub

		List<Empleado> empleados = new ArrayList<Empleado>();

		try {

			List<String> lineas = Files.readAllLines(Paths.get(this.path));

			for (String empleado : lineas) {

				Empleado e;
				try {
					e = new Empleado(empleado);
					empleados.add(e);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		} catch (IOException ex) {
			throw new RuntimeException("No se pudo Abrir", ex);
		}

		return empleados;
	}

	@Override
	public boolean existe(Empleado empleado) {

		List<Empleado> empleados = recuperarEmpleados();

		return empleados.contains(empleado);
	}
}