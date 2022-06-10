package n1exercici5SamayoaS;

public class Ordenador {
	private String marca;
	private String modelo;
	private String procesador;
	private int ram;

	public Ordenador(String marca, String modelo, String procesador, int ram) {
		this.marca 		= marca;
		this.modelo 	= modelo;
		this.procesador = procesador;
		this.ram 		= ram;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String ejecutando(String programa) {
		return "Se esta ejecutando " +programa;
	}

	@Override
	public String toString() {
		return "Ordenador ==> Marca: " + marca + ", modelo: " + modelo + ", procesador: " + procesador + ", ram: " + ram;
	}


	


}
