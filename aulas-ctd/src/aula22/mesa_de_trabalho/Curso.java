package aula22.mesa_de_trabalho;

public class Curso implements PrecoCurso {

    private String nome;
    private double valorHora;
    private int cargaHorariaTotal;

    public Curso(String nome, double valorHora, int cargaHorariaTotal) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.cargaHorariaTotal = cargaHorariaTotal;
    }

    @Override
    public double calcularPrecoHora() {
        return cargaHorariaTotal * valorHora;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    public String getNome() {
        return nome;
    }
}
