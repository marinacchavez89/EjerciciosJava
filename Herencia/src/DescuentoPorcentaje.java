public class DescuentoPorcentaje extends Descuento {

    public DescuentoPorcentaje(double valorDescuento) {
        super(valorDescuento);
    }

    @Override
    public double aplicarDescuento(double precio) throws DescuentoException {
        if (precio == 0) {
            throw new DescuentoException("No se puede aplicar un descuento a un carrito de precio 0");
        }
        double resultado = precio * (1 - valorDescuento/100);
        if (resultado < 0) {
            throw new DescuentoException("El resultado del descuento no puede ser negativo");
        }
        return resultado;
    }
}

