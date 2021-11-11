package aula06.mesa_de_trabalho;

import java.util.Scanner;

public class CachorroAdocao {
    private Boolean apto;
    private String raca;
    private int anoNascimento;
    private double peso;
    private Boolean chip;
    private Boolean ferido;
    private String nomeCao;

    public CachorroAdocao(String raca, int anoNascimento, double peso, Boolean chip){
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.chip = chip;
    }
    public CachorroAdocao() {
    }

    public Boolean getApto() {
        return apto;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public Boolean getChip() {
        return chip;
    }

    public Boolean getFerido() {
        return ferido;
    }

    public String getNomeCao() {
        return nomeCao;
    }

    public void saberIdade(int anoAtual){
        if(this.anoNascimento!=0) {
            int idadeCao = anoAtual - this.anoNascimento;
            System.out.println(idadeCao + " anos.");
        }
        else
            System.out.println("Não sabemos o anos de nascimento desse canzinho.");
    }

    public void validadeChip(){
        if (this.chip)
            System.out.println("Tem chip.");
        else
            System.out.println("Não tem chip.");
    }

    public void avaliacaoCao(){
        Scanner dadosAvaliacao;
        dadosAvaliacao=new Scanner(System.in);
        if (this.raca==null){
            System.out.println("Qual a raça do cãozinho?");
            this.raca=dadosAvaliacao.nextLine();
        }
        if (this.anoNascimento==0){
            System.out.println("Qual o ano de nascimento do cãozinho?");
            this.anoNascimento=dadosAvaliacao.nextInt();
        }
        if (this.peso==0.0){
            System.out.println("Qual o peso do cãozinho? (Obs. Usar vírgula como separador decimal)");
            this.peso=dadosAvaliacao.nextDouble();
        }
        if (this.chip==null){
            System.out.println("O cãozinho tem chip? Y(sim) N(não)");
            String respostaChip;
            respostaChip = dadosAvaliacao.next();
            if (respostaChip.equals("Y")||respostaChip.equals("y"))
                this.chip=true;
            else
                this.chip=false;
        }
        if (this.ferido==null) {
            System.out.println("O cãozinho esta ferido?  Y(sim) N(não)");
            String respostaFerido;
            respostaFerido = dadosAvaliacao.next();
            if (respostaFerido.equals("Y")||respostaFerido.equals("y"))
                this.ferido=true;
            else
                this.ferido=false;
        }
        if (this.nomeCao==null){
            System.out.println("Qual o nome temporario do cãozinho?");
            this.nomeCao = dadosAvaliacao.next();
        }else {
            System.out.println("O cãozinho se chama " + this.nomeCao);
        }

        avaliacaoAdocao();
    }

    public Boolean avaliacaoAdocao(){
        if (this.ferido || this.peso<5) {
            System.out.println("O cãozinho não está apto a ser adotado.");
            return this.apto = false;
        }
        else {
            System.out.println("O cãozinho está apto a ser adotado.");
            return this.apto = true;

        }
    }
}
