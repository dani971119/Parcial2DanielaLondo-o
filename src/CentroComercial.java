
public class CentroComercial {
    public static void main(String[] args) {
        DescuentoCalculable calculadorDescuento = new CalculadorDescuento();
        DetallesTienda detallesTienda = new ImpresorDetallesTienda("Tienda DANIELA", "ropa de niña", 100);

        double descuento = calculadorDescuento.calcularDescuento(detallesTienda.descuento, detallesTienda.tipoDeComercio);
        detallesTienda.imprimirDetalles();
        System.out.println("Descuento calculado: " + descuento);
    }
}

