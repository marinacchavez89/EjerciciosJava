public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {

    private double tope;

    public DescuentoPorcentajeConTope(double valorDescuento, double tope) {
        super(valorDescuento);
        this.tope = tope;
    }

    @Override
    public double aplicarDescuento(double precio) throws DescuentoException {
        if (precio == 0) {
            throw new DescuentoException("No se puede aplicar un descuento a un carrito de precio 0");
        }
        double descuento = super.aplicarDescuento(precio);
        double resultado = precio - Math.min(descuento, tope);
        if (resultado < 0) {
            throw new DescuentoException("El resultado del descuento no puede ser negativo");
        }
        return resultado;
    }
}
