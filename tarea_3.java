public class tarea_3 {
    public class Libro {
        String titulo;
        String autor;
        String ISBN;
        double precio;

        public Libro() {
            this.titulo = "Desconocido";
            this.autor = "Desconocido";
            this.ISBN = "000-0000000000";
            this.precio = 0.0;
        }

        public Libro(String titulo, String autor, String ISBN, double precio) {
            this.titulo = titulo;
            this.autor = autor;
            this.ISBN = ISBN;
            this.precio = precio;
        }

        public void mostrarDetalles() {
            System.out.println("Título: " + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.println("ISBN: " + this.ISBN);
            System.out.println("Precio: $" + this.precio);
        }

        public void actualizarPrecio(double nuevoPrecio) {
            this.precio = nuevoPrecio;
            System.out.println("El precio ha sido actualizado a: $" + this.precio);
        }
    }

    public class Main {
        public static void main(String[] args) {
            Libro libro1 = new Libro();
            libro1.mostrarDetalles();

            Libro libro2 = new Libro("El Quijote", "Miguel de Cervantes", "978-1234567890", 29.99);

            libro2.mostrarDetalles();

            libro2.actualizarPrecio(24.99);
            libro2.mostrarDetalles();
        }
    }

