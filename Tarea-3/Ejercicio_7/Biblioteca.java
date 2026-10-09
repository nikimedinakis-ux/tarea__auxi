package Ejercicio_7;
import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
    private String nombre;
    private List<Documento> documentos;
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.documentos = new ArrayList<>();
    }
    public void agregarDocumento(Documento doc) {
        this.documentos.add(doc);
    }
    public List<Documento> getDocumentos() { return this.documentos; }
    public void setDocumentos(List<Documento> lista) { this.documentos = lista; }
    public int contarPorTipo(String tipo) {
        int c = 0;
        for (Documento d : documentos) {
            if (d.getTipo().equals(tipo)) c++;
        }
        return c;
    }
    public Biblioteca realizarCopiaSeguridad(String nombreCopia) {
        Biblioteca copia = new Biblioteca(nombreCopia);    
        for (Documento d : this.documentos) {
            if (d instanceof LibroPapel) {
                copia.agregarDocumento(new LibroPapel(d.getTitulo(), d.getAutor(), d.getAnio()));
            } 
            else if (d instanceof RevistaInvestigacion) {
                RevistaInvestigacion ri = (RevistaInvestigacion) d;
                copia.agregarDocumento(new RevistaInvestigacion(ri.getTitulo(), ri.getAutor(), ri.getAnio(), ri.getVolumen(), ri.getNumero(), ri.getMes(), ri.getCampoInvestigacion()));
            } 
            else if (d instanceof RevistaPapel) {
                RevistaPapel rp = (RevistaPapel) d;
                copia.agregarDocumento(new RevistaPapel(rp.getTitulo(), rp.getAutor(), rp.getAnio(), rp.getVolumen(), rp.getNumero(), rp.getMes()));
            } 
            else if (d instanceof DocumentoCD) {
                DocumentoCD cd = (DocumentoCD) d;
                copia.agregarDocumento(new DocumentoCD(cd.getTitulo(), cd.getAutor(), cd.getAnio(), cd.getFormato(), cd.getLicencia()));
            }
        }
        return copia;
    }
    @Override
    public String toString() {
        return "Biblioteca " + nombre + " (" + documentos.size() + " documentos)";
    }
}
