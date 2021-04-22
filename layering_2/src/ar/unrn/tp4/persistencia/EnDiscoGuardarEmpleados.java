package ar.unrn.tp4.persistencia;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import ar.unrn.tp4.modelo.Empleado;
import ar.unrn.tp4.modelo.PersistenciaEmpleados;

public class EnDiscoGuardarEmpleados implements PersistenciaEmpleados {

	@Override
	public void guardarEmpleado(Empleado e) {
		// TODO Auto-generated method stub

		String empleado = e.apellido() + "," + e.nombre() + "," + e.fechaNacimiento() + "," + e.email();

		try {

			Files.write(Paths.get("C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\archivo_prueba2.txt"), empleado.getBytes(),
					StandardOpenOption.APPEND);

		} catch (IOException ex) {

			throw new RuntimeException("No se pudo persistir");
		}
	}

	@Override
	public String recuperarEmpleados() {
		// TODO Auto-generated method stub

		String contenido = "";
		int c;

		try {
			FileReader f = new FileReader("C:\\Users\\Simón\\Downloads\\UNRN\\Materias 3ro\\OO2\\archivo_prueba2.txt");
			c = f.read();

			while (c != -1) {
				contenido += (char) c;
				c = f.read();
			}

		} catch (IOException ex) {
			throw new RuntimeException("No se pudo Abrir...", ex);
		}

		return contenido;
	}

	@Override
	public boolean existe(Empleado empleado) {

		String empleados = recuperarEmpleados();

		return empleados.contains(empleado.apellido() + "," + empleado.nombre() + "," + empleado.fechaNacimiento() + ","
				+ empleado.email());
	}
}
