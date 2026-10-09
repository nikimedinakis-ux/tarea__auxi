package Ejercicio_7;
public class LibroPapel extends Documento {
    public LibroPapel(String titulo, String autor, int anio) {
        super(titulo, autor, anio);
    }
    @Override
    public String getTipo() { return "Libro"; }
    @Override
    public String toString() {
        return "Libro: " + getTitulo() + " (" + getAutor() + ", " + getAnio() + ")";
    }
}
