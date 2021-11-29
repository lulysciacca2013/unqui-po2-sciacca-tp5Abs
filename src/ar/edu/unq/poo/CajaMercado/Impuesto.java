package ar.edu.unq.poo.CajaMercado;

public class Impuesto extends Factura{
	private double tasa;

	public Impuesto(double tasa) {
		super();
		this.tasa= tasa;
	}
	
	public double getPrecio() {
		return this.getTasa();
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	
	
}
