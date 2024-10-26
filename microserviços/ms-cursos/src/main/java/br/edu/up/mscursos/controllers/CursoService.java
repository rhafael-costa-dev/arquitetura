package br.edu.up.mscursos.controllers;

import br.edu.up.mscursos.modelos.Curso;

import java.util.List;


public class CursoService {
    private static List<Curso> cursos = List.of(
            new Curso(1, "Direito"),
            new Curso(2, "Enfermagem"),
            new Curso(3, "Ciência da Computação"),
            new Curso(4, "Medicina"),
            new Curso(5, "Filosofia")
    );

    public static List<Curso> listAll() {
        return cursos;
    }

    public static Curso findById(Integer id) {
        return cursos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
