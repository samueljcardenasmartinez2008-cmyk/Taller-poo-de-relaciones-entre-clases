package herencia;

public class MainHerencia {
    public static void main(String[] args) {
        Perro perro = new Perro("Rex", 3, "Labrador");
        Gato gato = new Gato("Misu", 2, true);

        perro.comer();
        perro.hacerSonido();
        perro.moverCola();

        gato.comer();
        gato.hacerSonido();
        gato.trepar();
    }
}
