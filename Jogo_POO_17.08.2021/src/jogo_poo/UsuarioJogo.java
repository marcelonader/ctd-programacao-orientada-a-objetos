package jogo_poo;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    public UsuarioJogo (String nome, String nickname){
      this.nome = nome;
      this.nickname = nickname;
      this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void aumentarPontuacao(){
      this.pontuacao += 1;
    }
    public void subirNivel(){
        this.nivel += 1;
    }
    public void bonus(int valor){
        this.pontuacao += valor;
    }
}
