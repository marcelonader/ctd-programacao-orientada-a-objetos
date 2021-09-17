package checkpoint;

public class Usuario {
    private int identificador;
    private String nome;
    private String senha;
    private String dataDaCriacao;

    private static int contador = 00001;

    public Usuario(String nome, String senha, String dataDaCriacao) {
        this.nome = nome;
        this.identificador = this.contador;
        this.senha = senha;
        this.dataDaCriacao = dataDaCriacao;
        contador++;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDataDaCriacao() {
        return dataDaCriacao;
    }

    public void setDataDaCriacao(String dataDaCriacao) {
        this.dataDaCriacao = dataDaCriacao;
    }

}
