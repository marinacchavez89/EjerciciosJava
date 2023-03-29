import java.util.ArrayList;
import java.util.List;
	
public class Carrito {

	    private List<Double> productos = new ArrayList<>();
	    private Descuento descuento;

	    public void agregarProducto(double precio) {
	        productos.add(precio);
	    }

	    public void setDescuento(Descuento descuento) {
	        this.descuento = descuento;
	    }

	    public double calcularPrecio() {
	        double precioTotal = productos.stream().mapToDouble(Double::doubleValue).sum();
	        if (descuento != null) {
	            precioTotal = descuento.aplicarDescuento(precioTotal);
	        }
	        return precioTotal;
	    }
}
	
	

	    


