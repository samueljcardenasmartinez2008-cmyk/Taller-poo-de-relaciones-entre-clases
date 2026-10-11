package asociacion;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public void inscribir(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            curso.agregarEstudiante(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
}
