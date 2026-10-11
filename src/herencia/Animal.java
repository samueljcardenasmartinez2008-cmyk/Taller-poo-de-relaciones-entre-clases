package herencia;

public class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}
