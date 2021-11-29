package ar.edu.unq.poo.CajaMercado;

import java.util.ArrayList;

public class Caja {
	
	ArrayList<Cobrable> cobrable= new ArrayList <Cobrable>();

	public Caja() {
		// TODO Auto-generated constructor stub
	}
	
	public void agregarACaja(Cobrable cobrable) {
		this.getCobrable().add(cobrable);
		
	}
	
	public double montoAPagar() {
		double totalAPagar=0;
		for(int i=0; i <cobrable.size();i++) {
			totalAPagar= totalAPagar + cobrable.get(i).getPrecio();
			
		}
		return totalAPagar;
	}
	
	/*public void rebajarStock() {
		int stock=0;
		for(int i=0; i <producto.size();i++) {
			stock = producto.get(i).getStock()-1;
			producto.get(i).setStock(stock);
		}
	}*/
	
	

	public ArrayList<Cobrable> getCobrable() {
		return cobrable;
	}

	public void setCobrable(ArrayList<Cobrable> cobrable) {
		this.cobrable = cobrable;
	}
	
	

}
