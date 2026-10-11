package dependencia;

public class Impresora {
    // Documento llega como parámetro: no es atributo de Impresora.
    public void imprimir(Documento doc) {
        System.out.println("Imprimiendo: " + doc.getTitulo());
        System.out.println(doc.getContenido());
    }
}
