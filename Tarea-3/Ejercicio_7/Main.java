package Ejercicio_7;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void compararBibliotecas(Biblioteca b1, Biblioteca b2) {
        System.out.println("\n--- COMPARACIÓN (Inciso b) ---");
        int r1 = b1.contarPorTipo("Revista");
        int r2 = b2.contarPorTipo("Revista");

        if (r1 > r2) System.out.println("La primera biblioteca tiene más revistas.");
        else if (r2 > r1) System.out.println("La segunda biblioteca tiene más revistas.");
        else System.out.println("Ambas tienen la misma cantidad de revistas.");

        if (b1.getDocumentos().size() > b2.getDocumentos().size()) {
            System.out.println("La primera biblioteca tiene más documentos en total.");
        } else if (b2.getDocumentos().size() > b1.getDocumentos().size()) {
            System.out.println("La segunda biblioteca tiene más documentos en total.");
        } else {
            System.out.println("Ambas tienen el mismo número de documentos.");
        }
    }
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 7: SISTEMA DE BIBLIOTECA MULTIMEDIA ===");
        Biblioteca b1 = new Biblioteca("Central");
        Biblioteca b2 = new Biblioteca("Tecnología");

        b1.agregarDocumento(new LibroPapel("Cálculo I", "James Stewart", 2015));
        b1.agregarDocumento(new RevistaPapel("Scientific American", "Múltiples", 2023, 12, 4, "Octubre"));
        b2.agregarDocumento(new RevistaInvestigacion("AI Trends", "UMSA", 2026, 1, 2, "Enero", "Ciencia de Datos"));
        b2.agregarDocumento(new DocumentoCD("Ubuntu OS", "Canonical", 2024, "ISO", "GPL"));

        compararBibliotecas(b1, b2);

        List<Documento> todos = new ArrayList<>();
        todos.addAll(b1.getDocumentos());
        todos.addAll(b2.getDocumentos());

        List<Documento> nuevosB1 = new ArrayList<>();
        List<Documento> nuevosB2 = new ArrayList<>();

        for (Documento d : todos) {
            if (d.getTipo().equals("Revista")) {
                nuevosB1.add(d);
            } else if (d.getTipo().equals("Libro")) {
                nuevosB2.add(d);
            } else {
                if (b1.getDocumentos().contains(d)) nuevosB1.add(d);
                else nuevosB2.add(d);
            }
        }
        b1.setDocumentos(nuevosB1);
        b2.setDocumentos(nuevosB2);

        System.out.println("\n--- Después del Traslado (Inciso c) ---");
        System.out.println("Revistas en Central: " + b1.contarPorTipo("Revista") + " | Libros: " + b1.contarPorTipo("Libro"));
        System.out.println("Revistas en Tecnología: " + b2.contarPorTipo("Revista") + " | Libros: " + b2.contarPorTipo("Libro"));
        System.out.println("\n--- Realizando Copia de Seguridad (Inciso d) ---");
        Biblioteca copiaB1 = b1.realizarCopiaSeguridad("Backup_Central");
        Biblioteca copiaB2 = b2.realizarCopiaSeguridad("Backup_Tecnologia");

        System.out.println("Clonación exitosa -> " + copiaB1);
        System.out.println("Clonación exitosa -> " + copiaB2);
    }
}
