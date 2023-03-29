public class DescuentoFijo extends Descuento {

    public DescuentoFijo(double valorDescuento) {
        super(valorDescuento);
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio - valorDescuento;
    }
}