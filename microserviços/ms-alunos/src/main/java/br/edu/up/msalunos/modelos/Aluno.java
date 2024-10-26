package br.edu.up.msalunos.modelos;

public class Aluno {
    private Integer id;
    private String name;
    private Curso curso;
    public Aluno() {
    }
    public Aluno(Integer id, String name, Curso curso) {
        this.id = id;
        this.name = name;
        this.curso = curso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
