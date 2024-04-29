// Clase abstracta para imprimir detalles de la tienda
abstract class DetallesTienda {
    protected String nombreTienda;
    protected String tipoDeComercio;
    protected double descuento;

    public DetallesTienda(String nombreTienda, String tipoDeComercio, double descuento) {
        this.nombreTienda = nombreTienda;
        this.tipoDeComercio = tipoDeComercio;
        this.descuento = descuento;
    }

    public abstract void imprimirDetalles();
}