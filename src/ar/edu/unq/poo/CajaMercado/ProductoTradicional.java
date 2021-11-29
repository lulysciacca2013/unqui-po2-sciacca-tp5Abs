package ar.edu.unq.poo.CajaMercado;

public class ProductoTradicional extends Producto {
	
	public ProductoTradicional(String nombre,double precio,int stock) {
		super();
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}

	
	@Override
	public double getPrecio() {
		return precio;
	}


}
