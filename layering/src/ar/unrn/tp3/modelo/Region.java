package ar.unrn.tp3.modelo;

public class Region {

	private String region;

	public Region(String region) throws ValidacionException {

		if (!region.equals("China") && !region.equals("US") && !region.equals("Europa"))
			throw new ValidacionException("Region desconocida. Las conocidas son: China, US, Europa");

		this.region = region;
	}

	public String obtenerRegion() {
		return this.region;
	}
}