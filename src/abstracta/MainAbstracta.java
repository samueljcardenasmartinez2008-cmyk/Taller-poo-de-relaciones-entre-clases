package abstracta;

public class MainAbstracta {
    public static void main(String[] args) {
        Figura c = new Circulo("Rojo", 2);
        Figura r = new Rectangulo("Azul", 4, 5);

        c.mostrarColor();
        System.out.printf("Área del círculo: %.2f%n", c.calcularArea());

        r.mostrarColor();
        System.out.printf("Área del rectángulo: %.2f%n", r.calcularArea());
    }
}
