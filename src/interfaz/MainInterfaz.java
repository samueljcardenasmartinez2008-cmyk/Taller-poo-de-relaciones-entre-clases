package interfaz;

public class MainInterfaz {
    public static void main(String[] args) {
        Pagable medio1 = new TarjetaCredito(500000);
        Pagable medio2 = new Efectivo(20000);

        medio1.pagar(150000);
        medio2.pagar(50000);
    }
}
