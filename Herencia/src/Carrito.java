import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Carrito {
    private List<Double> productos = new ArrayList<>();
    private Descuento descuento;

    public void agregarProducto(double precio) {
        productos.add(precio);
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public double calcularPrecio() throws CarritoException {
        if (productos.isEmpty()) {
            throw new CarritoException("El carrito no tiene productos");
        }
        double precioTotal = 0;
        for (double precio : productos) {
            precioTotal += precio;
        }
        try {
            if (descuento != null) {
                precioTotal = descuento.aplicarDescuento(precioTotal);
            }
        } catch (DescuentoException e) {
            throw new CarritoException(e.getMessage());
        }
        return precioTotal;
    }
}
	    


