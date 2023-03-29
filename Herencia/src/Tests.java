import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;



class Tests {

	  @Test
	    public void testPrecioSinDescuentos() {
	        Carrito carrito = new Carrito();
	        carrito.agregarProducto(100);
	        carrito.agregarProducto(50);
	        assertEquals(150, carrito.precio());
	    }

	    @Test
	    public void testPrecioConDescuentoFijo() {
	        Carrito carrito = new Carrito();
	        carrito.agregarProducto(100);
	        carrito.agregarProducto(50);
	        carrito.aplicarDescuentoFijo(20);
	        assertEquals(130, carrito.precio());
	    }

	    @Test
	    public void testPrecioConDescuentoPorcentaje() {
	        Carrito carrito = new Carrito();
	        carrito.agregarProducto(100);
	        carrito.agregarProducto(50);
	        carrito.aplicarDescuentoPorcentaje(10);
	        assertEquals(135, carrito.precio());
	    }

	    @Test
	    public void testPrecioConDescuentoPorcentajeConTope() {
	        Carrito carrito = new Carrito();
	        carrito.agregarProducto(100);
	        carrito.agregarProducto(50);
	        DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope(50, 20);
	        carrito.aplicarDescuentoPorcentajeConTope(descuento.aplicarDescuento(carrito.precio()), 30);
	        assertEquals(120, carrito.precio());
	    }

}
