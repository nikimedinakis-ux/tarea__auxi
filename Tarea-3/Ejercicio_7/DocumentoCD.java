package Ejercicio_7;
public class DocumentoCD extends Documento {
    private String formato;
    private String licencia;
    public DocumentoCD(String titulo, String autor, int anio, String formato, String licencia) {
        super(titulo, autor, anio);
        this.formato = formato;
        this.licencia = licencia;
    }
    public String getFormato() { return formato; }
    public String getLicencia() { return licencia; }
    @Override
    public String getTipo() { return "CD"; }
    @Override
    public String toString() {
        return "CD: " + getTitulo() + " [Formato: " + formato + ", Licencia: " + licencia + "]";
    }
}
