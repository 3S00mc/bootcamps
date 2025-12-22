package desafios.desafio_bootcamp.dominio;

public class Curso extends Conteudo{

    //Attributes
    private int cargaHoraria;

    //Constructors
    public Curso() {
    }

    //Methods
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //Getters and Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //toString
    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }
}
