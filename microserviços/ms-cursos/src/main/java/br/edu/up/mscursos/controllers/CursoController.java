package br.edu.up.mscursos.controllers;

import br.edu.up.mscursos.modelos.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @GetMapping
    public List<Curso> list() {
        return CursoService.listAll();
    }

    @GetMapping("/{id}")
    public Curso findById(@PathVariable Integer id) {
        return CursoService.findById(id);
    }
}
