package desafios.desafio_bootcamp.dominio;

public abstract class Conteudo {

    //Constants
    protected static final double XP_PADRAO = 10;

    //Attributes
    private String titulo;
    private String descricao;

    //Methods
    public abstract double calcularXp();

    //Getters and Setters
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
}
