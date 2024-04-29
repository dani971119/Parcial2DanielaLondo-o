// Implementación de la interfaz DescuentoCalculable para calcular el descuento según el tipo de comercio
class CalculadorDescuento implements DescuentoCalculable {
    @Override
    public double calcularDescuento(double descuento, String tipoDeComercio) {
        return switch (tipoDeComercio.toLowerCase()) {
            case "ropa de niño" -> descuento * 0.08;
            case "dispositivos electrónicos" -> descuento * 0.04;
            case "nuevo tipo" -> descuento * 0.1;
            default -> 0;
        }; // Agregamos un nuevo tipo de comercio con un 10% de descuento
    }
}

