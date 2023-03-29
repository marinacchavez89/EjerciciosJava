public class DescuentoPorcentaje extends Descuento {

    public DescuentoPorcentaje(double valorDescuento) {
        super(valorDescuento);
    }

    @Override
    public double aplicarDescuento(double precio) {
        return precio * (1 - valorDescuento/100);
    }
}
