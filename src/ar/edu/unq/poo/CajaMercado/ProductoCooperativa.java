package ar.edu.unq.poo.CajaMercado;

public class ProductoCooperativa extends Producto{
	

	public ProductoCooperativa(String nombre,double precio,int stock) {
		super();
		this.nombre=nombre;
		this.precio=precio;
		this.stock=stock;
	}

	
	@Override
	public double getPrecio() {
		return this.precio *0.9;
	}

	

}
