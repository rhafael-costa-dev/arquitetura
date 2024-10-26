package br.edu.up.msalunos.clients;

import br.edu.up.msalunos.modelos.Curso;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("ms-cursos")
public interface CursoFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/cursos/{id}")
    Curso findById(@PathVariable Integer id);
}
