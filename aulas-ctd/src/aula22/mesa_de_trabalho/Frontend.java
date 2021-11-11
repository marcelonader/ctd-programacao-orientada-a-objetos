package aula22.mesa_de_trabalho;

public class Frontend implements PrecoCurso {

    private double valorHora;
    private int cargaHorariaTotal;

    public Frontend (double valorHora, int cargaHorariaTotal) {
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

}
