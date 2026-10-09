package Ejercicio_7;
public class Documento {
    private String titulo;
    private String autor;
    private int anio;
    public Documento(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    public String getTipo() {
        return "Documento";
    }
    public String getTitulo() { return this.titulo; }
    public String getAutor() { return this.autor; }
    public int getAnio() { return this.anio; }
}
