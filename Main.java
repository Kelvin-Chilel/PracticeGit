//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {public class Main {
    public static void main(String[] args) {
        // Crear instancia de ProductoAlimenticio
        ProductoAlimenticio leche = new ProductoAlimenticio(
                "Leche",
                "Leche de vaca",
                "Alimentos",
                1.50,
                "http://example.com/leche.jpg",
                "01-08-2024"
        );

        // Crear instancia de ProductoElectronico
        ProductoElectronico telefono = new ProductoElectronico(
                "Teléfono",
                "Teléfono móvil",
                "Electrónicos",
                500.00,
                "http://example.com/telefono.jpg",
                24
        );

        // Mostrar detalles y calcular precio de venta de leche
        leche.mostrarDetalles();
        System.out.println("Precio de venta: $" + leche.calcularPrecioVenta());

        // Mostrar detalles y calcular precio de venta de teléfono
        telefono.mostrarDetalles();
        System.out.println("Precio de venta: $" + telefono.calcularPrecioVenta());
    }
}

}