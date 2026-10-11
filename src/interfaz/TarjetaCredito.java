package interfaz;

public class TarjetaCredito implements Pagable {
    private double cupo;

    public TarjetaCredito(double cupo) {
        this.cupo = cupo;
    }

    @Override
    public boolean pagar(double monto) {
        if (monto >= 0 && monto <= cupo) {
            cupo -= monto;
            System.out.println("Pago con tarjeta aprobado: $" + monto);
            return true;
        }
        System.out.println("Cupo insuficiente o monto inválido.");
        return false;
    }
}
