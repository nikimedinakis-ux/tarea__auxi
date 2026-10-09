package Ejercicio_7;
public class RevistaPapel extends Documento {
    private int volumen;
    private int numero;
    private String mes;
    public RevistaPapel(String titulo, String autor, int anio, int volumen, int numero, String mes) {
        super(titulo, autor, anio);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    public int getVolumen() { return volumen; }
    public int getNumero() { return numero; }
    public String getMes() { return mes; }
    @Override
    public String getTipo() { return "Revista"; }
    @Override
    public String toString() {
        return "Revista: " + getTitulo() + " [Vol. " + volumen + ", No. " + numero + ", Mes: " + mes + "]";
    }
}
