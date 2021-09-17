package checkpoint;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoqueDeMercadorias = new Estoque();
        RegistroDeVendas registroDeVendas = new RegistroDeVendas();
        CadastroDeUsuarios cadastroDeUsuarios = new CadastroDeUsuarios();
        Scanner scanner = new Scanner(System.in);

        System.out.println("+--------------------------------------------------------------------------+");
        System.out.println("|                       INICIALIZAR O SISTEMA? [s/n]                       |");
        System.out.println("+--------------------------------------------------------------------------+");
        System.out.print("Resposta: ");
        String resultadoUsuario = scanner.nextLine();
        if(resultadoUsuario.toUpperCase(Locale.ROOT).equals("S")){
            do {
                System.out.println("\n============================= PÁGINA INICIAL =============================\n");
                System.out.println("(1) Logar em uma conta já existente");
                System.out.println("(2) Criar nova conta");
                int respostaLogarCadastrar = scanner.nextInt();
                if (respostaLogarCadastrar == 1) {
                    if (cadastroDeUsuarios.logar()) {
                        do {
                            System.out.println("\n==================== DIGITE O NÚMERO DA OPÇÃO DESEJADA ===================\n");
                            System.out.println("(1) Ver estoque geral");
                            System.out.println("(2) Ver estoque de chaveiros");
                            System.out.println("(3) Ver estoque de toalhas");
                            System.out.println("(4) Cadastrar novo produto");
                            System.out.println("(5) Adicionar item de um produto já existente");
                            System.out.println("(6) Vender um item de um produto já existente");
                            System.out.println("(7) Ver histórico de vendas");
                            int resultado2Usuario = scanner.nextInt();
                            switch (resultado2Usuario) {
                                case 1:
                                    estoqueDeMercadorias.listarTodosOsProdutos();
                                    break;
                                case 2:
                                    estoqueDeMercadorias.listarChaveiros();
                                    break;
                                case 3:
                                    estoqueDeMercadorias.listarToalhas();
                                    break;
                                case 4:
                                    estoqueDeMercadorias.cadastrarNovoProduto();
                                    break;
                                case 5:
                                    estoqueDeMercadorias.adicionarItemAoEstoque();
                                    break;
                                case 6:
                                    estoqueDeMercadorias.venderItemDoEstoque();
                                    break;
                                case 7:
                                    registroDeVendas.mostrarRegistroDaVenda();
                                    break;
                                default:
                                    System.out.println("Opção inválida.");
                            }
                            System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------" +
                                    "\n================= Deseja realizar outra operação? [s/n] ==================");
                            System.out.print("Resposta: ");
                            resultadoUsuario = scanner.nextLine();
                            resultadoUsuario = scanner.nextLine();
                            if (resultadoUsuario.toUpperCase(Locale.ROOT).equals("N")) {
                                System.out.println("\n===== Tem certeza que deseja sair? O programa será encerrado. [s/n] ======");
                                System.out.print("Resposta: ");
                                String resultadoUsuarioConfirmacao = scanner.nextLine();
                                if (resultadoUsuarioConfirmacao.toUpperCase(Locale.ROOT).equals("S")) {
                                    resultadoUsuario = "N";
                                } else {
                                    resultadoUsuario = "S";
                                }
                            }
                        } while ((resultadoUsuario.toUpperCase(Locale.ROOT).equals("S")));
                    }
                } else if (respostaLogarCadastrar == 2) {
                    cadastroDeUsuarios.cadastrarUsuario();
                    System.out.println("\n======================== O QUE VOCÊ DESEJA FAZER? ========================\n");
                    System.out.println("(1) Retornar à página inicial para efetuar o login");
                    System.out.println("(2) Encerrar o programa");
                    int respostaUsuario = scanner.nextInt();
                    if (respostaUsuario == 1)
                        resultadoUsuario = "S";
                    else
                        resultadoUsuario = "N";
                }
            } while (resultadoUsuario.toUpperCase(Locale.ROOT).equals("S"));
        }
    }
}
