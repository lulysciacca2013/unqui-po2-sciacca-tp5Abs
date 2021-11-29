package ar.edu.unq.poo.CajaMercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	private ProductoTradicional leche;
	private ProductoTradicional queso;
	private ProductoTradicional yogurt;
	private ProductoCooperativa jabon;
	private ProductoCooperativa detergente;
	private ProductoCooperativa lavandina;
	private Caja caja;
	private Servicio servicio;
	private Impuesto impuesto;
	
	@BeforeEach
	void setUp()  {
		leche= new ProductoTradicional("leche", 100, 1000);
		queso= new ProductoTradicional("queso", 310, 500);
		yogurt= new ProductoTradicional("yogurt", 150, 160);
		jabon= new ProductoCooperativa ("jabon", 70, 500);
		detergente= new ProductoCooperativa ("detergente", 190, 65);
		lavandina= new ProductoCooperativa ("lavandina", 212.50, 1); 
		servicio= new Servicio (10,20);
		impuesto= new Impuesto (2000);
		caja= new Caja();
		
		caja.agregarACaja(leche);
		caja.agregarACaja(queso);
		caja.agregarACaja(yogurt);
		caja.agregarACaja(jabon);
		caja.agregarACaja(detergente);
		caja.agregarACaja(lavandina);
		caja.agregarACaja(servicio);
		caja.agregarACaja(impuesto);
		
		
	}

	@Test
	void testMontoAPagar() {
		double total = caja.montoAPagar();
		assertEquals(total, 3185.25, 0);
		
	}
	
	
}
