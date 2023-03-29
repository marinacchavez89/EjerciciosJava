public abstract class Descuento {
    protected double valorDescuento;

    public Descuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    public abstract double aplicarDescuento(double precio) throws DescuentoException;

    public double getValorDescuento() {
        return valorDescuento;
    }

    public void setValorDescuento(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }
}
