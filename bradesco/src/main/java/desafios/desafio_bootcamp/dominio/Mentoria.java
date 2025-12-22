package desafios.desafio_bootcamp.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{


    //Attributes
    private LocalDate data;

    //Constructors
    public Mentoria() {
    }

    //Methods
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    //Getters and Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //toString
    @Override
    public String toString() {
        return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
    }
}
