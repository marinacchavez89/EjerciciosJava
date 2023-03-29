
public class Carrito {

	private int precioTotal;
    private boolean descuentoFijo;
    private double valorDescuento;

    public Carrito() {
        precioTotal = 0;
        descuentoFijo = false;
        valorDescuento = 0;
    }

    public void agregarProducto(int precio) {
        precioTotal += precio;
    }

    public void aplicarDescuentoFijo(double valor) {
        descuentoFijo = true;
        valorDescuento = valor;
    }

    public void aplicarDescuentoPorcentaje(double porcentaje) {
        double descuento = (precioTotal * porcentaje) / 100;
        precioTotal -= descuento;
    }

    public void aplicarDescuentoPorcentajeConTope(double porcentaje, double tope) {
        double descuento = (precioTotal * porcentaje) / 100;
        if (descuento > tope) {
            descuento = tope;
        }
        precioTotal -= descuento;
    }

    public int precio() {
        int precioFinal = precioTotal;
        if (descuentoFijo) {
            precioFinal -= valorDescuento;
        }
        return precioFinal;
    }

}
	
	

	    


