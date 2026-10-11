package interfaz;

public class Efectivo implements Pagable {
    private double disponible;

    public Efectivo(double disponible) {
        this.disponible = disponible;
    }

    @Override
    public boolean pagar(double monto) {
        if (monto >= 0 && monto <= disponible) {
            disponible -= monto;
            System.out.println("Pago en efectivo realizado: $" + monto);
            return true;
        }
        System.out.println("Efectivo insuficiente o monto inválido.");
        return false;
    }
}
