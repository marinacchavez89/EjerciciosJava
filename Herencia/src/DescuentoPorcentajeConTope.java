
public class DescuentoPorcentajeConTope {
	
	private double porcentaje;
    private double tope;

    public DescuentoPorcentajeConTope(double porcentaje, double tope) {
        this.porcentaje = porcentaje;
        this.tope = tope;
    }

    public double aplicarDescuento(double precio) {
        double descuento = (precio * porcentaje) / 100;
        if (descuento > tope) {
            descuento = tope;
        }
        return descuento;
    }

}
