package Ejercicio_7;
public class RevistaInvestigacion extends RevistaPapel {
    private String campoInvestigacion;
    public RevistaInvestigacion(String titulo, String autor, int anio, int volumen, int numero, String mes, String campo) {
        super(titulo, autor, anio, volumen, numero, mes);
        this.campoInvestigacion = campo;
    }
    public String getCampoInvestigacion() { return campoInvestigacion; }
    @Override
    public String toString() {
        return "Revista de Investigación (" + campoInvestigacion + "): " + getTitulo();
    }
}
