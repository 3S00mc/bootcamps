package br.com.bradesco.desafios.desafio_bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria {
    // Attributes
    private String titulo;
    private String descricao;
    private LocalDate data;

    //Constructors
    public Mentoria() {
    }

    //Methods
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + "]";
    }
}
