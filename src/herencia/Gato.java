package herencia;

public class Gato extends Animal {
    private boolean esCasero;

    public Gato(String nombre, int edad, boolean esCasero) {
        super(nombre, edad);
        this.esCasero = esCasero;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void trepar() {
        System.out.println(getNombre() + " trepa.");
    }
}
