import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    @Test
    public void testPrecioSinDescuento() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(10);
        carrito.agregarProducto(20);
        carrito.agregarProducto(30);

        assertEquals(60, carrito.calcularPrecio(), 0.1);
    }

    @Test
    public void testDescuentoFijo() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(10);
        carrito.agregarProducto(20);
        carrito.agregarProducto(30);

        Descuento descuento = new DescuentoFijo(5);
        carrito.setDescuento(descuento);

        assertEquals(55, carrito.calcularPrecio(), 0.1);
    }

    @Test
    public void testDescuentoPorcentaje() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(10);
        carrito.agregarProducto(20);
        carrito.agregarProducto(30);

        Descuento descuento = new DescuentoPorcentaje(20);
        carrito.setDescuento(descuento);
        assertEquals(48, carrito.calcularPrecio(), 0.1);
    }
    
    @Test
    public void testDescuentoPorcentajeConTope() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto(10);
        carrito.agregarProducto(20);
        carrito.agregarProducto(30);

        Descuento descuento = new DescuentoPorcentajeConTope(50, 10);
        carrito.setDescuento(descuento);

        assertEquals(50, carrito.calcularPrecio(), 0.1);
    }
   
}