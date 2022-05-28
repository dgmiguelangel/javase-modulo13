package clase18.consultas.bd;

public class Compacto extends Auto {
	
	private int puestos;

	public Compacto() {
		super();
	}
	
	
	public Compacto(String color, String marca, Patente patente, boolean encendido, int puestos) {
		super(color, marca, patente, encendido);
		this.puestos = puestos;
	}
	
	
	@Override
	public String toString() {
		return "Compacto [puestos=" + puestos + ", toString()=" + super.toString() + "]";
	}
	
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}



}
