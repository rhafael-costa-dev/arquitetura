package br.edu.up.msalunos.controllers;

import br.edu.up.msalunos.modelos.Aluno;
import br.edu.up.msalunos.modelos.Curso;

import java.util.List;

public class AlunoService {

    private static List<Aluno> alunos = List.of(
        new Aluno(1, "João", new Curso(1, "")),
        new Aluno(1, "João", new Curso(3, ""))

    );

    public static List<Aluno> listAll() {
        return alunos;
    }

    public static Aluno findById(Integer id) {
        return alunos.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
