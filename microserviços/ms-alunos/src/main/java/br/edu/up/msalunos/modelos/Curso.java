package br.edu.up.msalunos.modelos;

public class Curso {
    private Integer id;
    private String name;
    public Curso() {

    }
    public Curso(Integer id, String name) {
        this.id = id;
        this.name = name;
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
}
