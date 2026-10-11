package dependencia;

public class MainDependencia {
    public static void main(String[] args) {
        Documento doc = new Documento("Informe", "Contenido del informe de POO.");
        Impresora impresora = new Impresora();
        impresora.imprimir(doc);
    }
}
