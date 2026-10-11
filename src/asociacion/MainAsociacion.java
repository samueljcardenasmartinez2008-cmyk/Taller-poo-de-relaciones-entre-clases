package asociacion;

public class MainAsociacion {
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana");
        Estudiante luis = new Estudiante("Luis");

        Curso poo = new Curso("Programación Orientada a Objetos");
        Curso datos = new Curso("Estructuras de Datos");

        ana.inscribir(poo);
        ana.inscribir(datos);
        luis.inscribir(poo);

        for (Estudiante estudiante : poo.getEstudiantes()) {
            System.out.println(estudiante.getNombre() + " está en " + poo.getNombre());
        }

        System.out.println("Ana tiene " + ana.getCursos().size() + " cursos.");
    }
}
