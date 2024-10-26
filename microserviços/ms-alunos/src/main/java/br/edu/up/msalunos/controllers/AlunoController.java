package br.edu.up.msalunos.controllers;

import br.edu.up.msalunos.clients.CursoFeignClient;
import br.edu.up.msalunos.modelos.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    CursoFeignClient cursoFeignClient;

    @GetMapping
    public List<Aluno> list() {
        var alunos = AlunoService.listAll();
        alunos.forEach(a -> {
            a.setCurso(cursoFeignClient.findById(a.getCurso().getId()));
        });
        return alunos;
    }

    @GetMapping("/{id}")
    public Aluno findById(@PathVariable Integer id) {
        return AlunoService.findById(id);
    }
}
