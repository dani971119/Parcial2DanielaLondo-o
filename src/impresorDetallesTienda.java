// Implementación de la clase DetallesTienda para imprimir los detalles de la tienda
class ImpresorDetallesTienda extends DetallesTienda {
    public ImpresorDetallesTienda(String nombreTienda, String tipoDeComercio, double descuento) {
        super(nombreTienda, tipoDeComercio, descuento);
    }

    @Override
    public void imprimirDetalles() {
        System.out.println("Nombre de la tienda: " + nombreTienda);
        System.out.println("Tipo de comercio: " + tipoDeComercio);
        System.out.println("Descuento: " + descuento);
    }
}
