package jokenpo;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class JokenPo {

    Scanner scanner = new Scanner(System.in);

    private int diaDaPartida;
    private int mesDaPartida;
    private int anoDaPartida;
    private String jogador1;
    private String jogador2;
    private String maoJogador1Convertida;
    private String maoJogador2Convertida;
    private String maoMaquinaConvertida;
    private int placarJogador1;
    private int placarJogador2;
    private int placarMaquina;
    private String nomeDaPartida;
    private int respostaUsuarioJogarNovamente;


//    public void setJogadores(String nomeJogador1, String nomeJogador2) {
//        this.jogador1 = nomeJogador1;
//        this.jogador2 = nomeJogador2;
//    }

    public String getJogadores() {
        return "Jogador(a)1: " + jogador1 + "\n" + "Jogador(a)2: " + jogador2;
    }

    public void setDataDaPartida(int diaDaPartida, int mesDaPartida, int anoDaPartida) {
        this.diaDaPartida = diaDaPartida;
        this.mesDaPartida = mesDaPartida;
        this.anoDaPartida = anoDaPartida;
    }

    public String getDataDaPartida() {
        return "Data da partida: " + diaDaPartida + "/" + mesDaPartida + "/" + anoDaPartida;
    }

    public void jogar() {
        System.out.println("Defina um nome para a partida.");
        String nomePartida = scanner.nextLine();
        this.nomeDaPartida = nomePartida;
        System.out.println("Escolha umas das opções a seguir: digite (1) para jogar contra outra pessoa, ou (2) para " +
                "jogar contra a máquina.");
        int opcaoEscolhida = scanner.nextInt();
        if (opcaoEscolhida == 1) {
            System.out.println("Defina um nickname para o(a) Jogador(a) 1");
            this.jogador1 = scanner.nextLine();
            this.jogador1 = scanner.nextLine();
            System.out.println("Defina um nickname para o(a) Jogador(a) 2");
            this.jogador2 = scanner.nextLine();
            this.jogador2 = scanner.nextLine();
            System.out.println("Preparem-se, " + jogador1 + " e " + jogador2 + ", vamos dar início  ao(à) \"" + nomePartida + "\".");
            iniciarPartidaDuasPessoas();
        } else if (opcaoEscolhida == 2) {
            System.out.println("Qual o seu nickname?");
            this.jogador1 = scanner.nextLine();
            this.jogador1 = scanner.nextLine();

            System.out.println("Prepare-se, " + jogador1 + ", vamos dar início  ao(à) \"" + nomePartida + "\". " + "Vamos ver se você é bom(a). Tente ganhar da máquina.");
            iniciarPartidaContraMaquina();
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public void iniciarPartidaDuasPessoas() {

        if (placarJogador1 == 3) {
            System.out.println("Fim de jogo: o(a) vencedor(a) da partida foi o(a) jogador(a) " + jogador1);
            placarJogador1 = 0;
            placarJogador2 = 0;
            System.out.println("Querem jogar mais uma vez? Digite (1) para \"Sim\" e (2) para \"Não\"");
            respostaUsuarioJogarNovamente = scanner.nextInt();
            if (respostaUsuarioJogarNovamente == 1) {
                jogar();
            } else {
                System.out.println("Certo, vamos deixar para um próxima vez.");
            }
        } else if (placarJogador2 == 3) {
            System.out.println("Fim de jogo: o(a) vencedor(a) da partida foi o(a) jogador(a) " + jogador2);
            placarJogador1 = 0;
            placarJogador2 = 0;
            System.out.println("Quereem jogar mais uma vez? Digite (1) para \"Sim\" e (2) para \"Não\"");
            respostaUsuarioJogarNovamente = scanner.nextInt();
            if (respostaUsuarioJogarNovamente == 1) {
                jogar();
            } else {
                System.out.println("Certo, vamos deixar para um próxima vez.");
            }
        } else if (placarJogador1 < 3 || placarJogador2 < 3) {
            System.out.println("Vez do(a) jogador(a) 1 - Digite o número (1) para pedra, (2) para papel e (3) para " +
                    "tesoura");
            int maoJogador1 = scanner.nextInt();
            if (maoJogador1 > 3 || maoJogador1 < 0) {
                System.out.println("Número digitado é inválido. Digite um número entre (1) pedra, (2) papel e (3) " +
                        "tesoura");
                maoJogador1 = scanner.nextInt();
            }
            ;
            System.out.println("Vez do(a) jogador(a) 2 - Digite o número (1) para pedra, (2) para papel e (3) para " +
                    "tesoura");
            int maoJogador2 = scanner.nextInt();
            if (maoJogador2 > 3 || maoJogador2 < 0) {
                System.out.println("Número digitado é inválido. Digite um número entre (1) pedra, (2) papel e (3) " +
                        "tesoura");
                maoJogador2 = scanner.nextInt();
            }
            ;

            int resultado = maoJogador1 - maoJogador2;


            switch (maoJogador1) {
                case 1:
                    this.maoJogador1Convertida = "pedra";
                    break;
                case 2:
                    this.maoJogador1Convertida = "papel";
                    break;
                case 3:
                    this.maoJogador1Convertida = "tesoura";
                    break;
            }

            switch (maoJogador2) {
                case 1:
                    this.maoJogador2Convertida = "pedra";
                    break;
                case 2:
                    this.maoJogador2Convertida = "papel";
                    break;
                case 3:
                    this.maoJogador2Convertida = "tesoura";
                    break;
            }

            if (resultado == 1 || resultado == -2) {
                System.out.println("Opção escolhida pelo(a) Jogador(a) 1: " + maoJogador1Convertida);
                System.out.println("Opção escolhida pelo(a) Jogador(a) 2: " + maoJogador2Convertida);
                System.out.println("Jogador(a) 1 ganhou!");
                placarJogador1++;
                System.out.println("----------PLACAR----------\n" + jogador1 + ": " + placarJogador1 + "\n" + jogador2 + ": " + placarJogador2);
            } else if (resultado == 0) {
                System.out.println("Opção escolhida pelo(a) Jogador(a) 1: " + maoJogador1Convertida);
                System.out.println("Opção escolhida pelo(a) Jogador(a) 2: " + maoJogador2Convertida);
                System.out.println("Empatou!");
                System.out.println("----------PLACAR----------\n" + jogador1 + ": " + placarJogador1 + "\n" + jogador2 + ": " + placarJogador2);
            } else {
                System.out.println("Opção escolhida pelo(a) Jogador(a) 1: " + maoJogador1Convertida);
                System.out.println("Opção escolhida pelo(a) Jogador(a) 2: " + maoJogador2Convertida);
                System.out.println("Jogador(a) 2 ganhou!");
                placarJogador2++;
                System.out.println("----------PLACAR----------\n" + jogador1 + ": " + placarJogador1 + "\n" + jogador2 + ": " + placarJogador2);
            }
            iniciarPartidaDuasPessoas();
        }
    }

    public void iniciarPartidaContraMaquina() {

        if (placarJogador1 == 3) {
            System.out.println("Fim de jogo: o(a) vencedor(a) da partida foi o(a) jogador(a) " + jogador1);
            placarJogador1 = 0;
            placarMaquina = 0;
            System.out.println("Quer jogar mais uma vez? Digite (1) para \"Sim\" e (2) para \"Não\"");
            respostaUsuarioJogarNovamente = scanner.nextInt();
            if (respostaUsuarioJogarNovamente == 1) {
                jogar();
            } else {
                System.out.println("Certo, vamos deixar para um próxima vez.");
            }
        } else if (placarMaquina == 3) {
            System.out.println("Fim de jogo: a Máquina ganhou!");
            placarJogador1 = 0;
            placarMaquina = 0;
            System.out.println("Quer jogar mais uma vez? Digite (1) para \"Sim\" e (2) para \"Não\"");
            respostaUsuarioJogarNovamente = scanner.nextInt();
            if (respostaUsuarioJogarNovamente == 1) {
                jogar();
            } else {
                System.out.println("Certo, vamos deixar para um próxima vez.");
            }
        } else if (placarJogador1 < 3 || placarMaquina < 3) {
            System.out.println("Digite o número (1) para pedra, (2) para papel e (3) para tesoura");
            int maoJogador1 = scanner.nextInt();
            if (maoJogador1 > 3 || maoJogador1 < 0) {
                System.out.println("Número digitado é inválido. Digite um número entre (1) pedra, (2) papel e (3) " +
                        "tesoura");
                maoJogador1 = scanner.nextInt();
            }
            ;
            int maoMaquina = (int) Math.round(Math.random() * 2 + 1);

            int resultado = maoJogador1 - maoMaquina;

            switch (maoJogador1) {
                case 1:
                    this.maoJogador1Convertida = "pedra";
                    break;
                case 2:
                    this.maoJogador1Convertida = "papel";
                    break;
                case 3:
                    this.maoJogador1Convertida = "tesoura";
                    break;
            }

            switch (maoMaquina) {
                case 1:
                    this.maoMaquinaConvertida = "pedra";
                    break;
                case 2:
                    this.maoMaquinaConvertida = "papel";
                    break;
                case 3:
                    this.maoMaquinaConvertida = "tesoura";
                    break;
            }

            if (resultado == 1 || resultado == -2) {
                System.out.println("Opção escolhida por você: " + maoJogador1Convertida);
                System.out.println("Opção escolhida pela Máquina: " + maoMaquinaConvertida);
                System.out.println("Você ganhou!");
                placarJogador1++;
                System.out.println("----------PLACAR----------\n" + jogador1 + ": " + placarJogador1 + "\n" + "M" +
                        "áquina: " + placarMaquina);
            } else if (resultado == 0) {
                System.out.println("Opção escolhida por você: " + maoJogador1Convertida);
                System.out.println("Opção escolhida pela Máquina: " + maoMaquinaConvertida);
                System.out.println("Empatou!");
                System.out.println("----------PLACAR----------\n" + jogador1 + ": " + placarJogador1 + "\n" + "M" +
                        "áquina: " + placarMaquina);
            } else {
                System.out.println("Opção escolhida por você: " + maoJogador1Convertida);
                System.out.println("Opção escolhida pela Máquina: " + maoMaquinaConvertida);
                System.out.println("Você perdeu!");
                placarMaquina++;
                System.out.println("----------PLACAR----------\n" + jogador1 + ": " + placarJogador1 + "\n" + "M" +
                        "áquina: " + placarMaquina);
            }
            iniciarPartidaContraMaquina();
        }

    }
}
