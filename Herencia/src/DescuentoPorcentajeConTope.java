public class DescuentoPorcentajeConTope extends DescuentoPorcentaje {

    private double tope;

    public DescuentoPorcentajeConTope(double valorDescuento, double tope) {
        super(valorDescuento);
        this.tope = tope;
    }

    @Override
    public double aplicarDescuento(double precio) {
        double descuento = super.aplicarDescuento(precio);
        if (descuento > tope) {
            return precio - tope;
        }
        return precio - descuento;
    }
}
