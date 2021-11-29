package ar.edu.unq.poo.CajaMercado;

public abstract class Producto implements Cobrable{
	protected String nombre;
	protected double precio;
	protected int stock;

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	abstract public double getPrecio();
	
	

}
