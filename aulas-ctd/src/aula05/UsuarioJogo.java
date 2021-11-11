package aula05;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
        this.pontuacao=0;
        this.nivel=0;
    }
    public void aumentarPontuacao(){
        ++this.pontuacao;
    }
    public void subirNivel(){
        ++this.nivel;
    }
    public int bonus(int valor){
        return this.pontuacao+=valor;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
