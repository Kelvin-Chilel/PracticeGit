public class ProductoAlimenticio {public class ProductoAlimenticio extends Producto implements Vendible {
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria, double precio, String urlFoto, String fechaCaducidad) {
        super(nombre, descripcion, categoria, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Categoría: " + getCategoria());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("URL Foto: " + getUrlFoto());
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
    }

    @Override
    public double calcularPrecioVenta() {
        return getPrecio() * 1.2; // Ejemplo: 20% de margen de ganancia
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}

}
