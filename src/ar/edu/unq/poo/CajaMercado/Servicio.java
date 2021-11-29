package ar.edu.unq.poo.CajaMercado;

public class Servicio extends Factura {
	
	private double costoPorUnidad;
	private int cantidadUnidades;
	
	public Servicio(double costoPorUnidad,int cantidadUnidades ) {
		super();
		this.cantidadUnidades= cantidadUnidades;
		this.costoPorUnidad= costoPorUnidad;
	}
	
	public double getPrecio() {
		return this.getCostoPorUnidad() * this.getCantidadUnidades();
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public void setCostoPorUnidad(double costoPorUnidad) {
		this.costoPorUnidad = costoPorUnidad;
	}

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}
	
	

}
