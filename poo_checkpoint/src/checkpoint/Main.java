package checkpoint;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estoque estoqueDeMercadorias = new Estoque();
        RegistroDeVendas registroDeVendas = new RegistroDeVendas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("+------------------------------------------------------------------+");
        System.out.println("|                                                                  |");
        System.out.println("|               OLÁ, DESEJA ACESSAR O SISTEMA? [s/n]               |");
        System.out.println("|                                                                  |");
        System.out.println("+------------------------------------------------------------------+");

        String resultadoUsuario = scanner.nextLine();
        while((resultadoUsuario.toUpperCase(Locale.ROOT).equals("S"))){
            System.out.println("\n =============== DIGITE O NÚMERO DA OPÇÃO DESEJADA ===============\n");
            System.out.println("(1) Ver estoque geral");
            System.out.println("(2) Ver estoque de chaveiros");
            System.out.println("(3) Ver estoque de toalhas");
            System.out.println("(4) Cadastrar novo produto");
            System.out.println("(5) Adicionar item de um produto já existente");
            System.out.println("(6) Vender um item de um produto já existente");
            System.out.println("(7) Ver histórico de vendas");
            int resultado2Usuario = scanner.nextInt();
            switch(resultado2Usuario){
                case 1: estoqueDeMercadorias.listarTodosOsProdutos();
                break;
                case 2: estoqueDeMercadorias.listarChaveiros();
                break;
                case 3: estoqueDeMercadorias.listarToalhas();
                break;
                case 4: estoqueDeMercadorias.cadastrarNovoProduto();
                break;
                case 5:
                    System.out.println("\n ================= Em qual categoria deseja adicionar? =================\n" +
                            "(1)Toalhas\n" +
                            "(2)Chaveiros\n");
                    int resultadoCategoria = scanner.nextInt();
                    if(resultadoCategoria==1){
                        estoqueDeMercadorias.listarIdentificadoresDasToalhas();
                        System.out.println("Preciso que você me passe duas informações.");
                        System.out.print("Número do identificador do produto já existente: ");
                        int resultadoIdentificador = scanner.nextInt();
                        System.out.print("Quantidade a ser adicionada: ");
                        int resultadoQuantidade = scanner.nextInt();
                        estoqueDeMercadorias.adicionarToalhaAoEstoque(resultadoIdentificador, resultadoQuantidade);
                    } else if(resultadoCategoria==2) {
                        estoqueDeMercadorias.listarIdentificadoresDosChaveiros();
                        System.out.println("Preciso que você me passe duas informações.");
                        System.out.print("Número do identificador do produto já existente: ");
                        int resultadoIdentificador = scanner.nextInt();
                        System.out.print("Quantidade a ser adicionada: ");
                        int resultadoQuantidade = scanner.nextInt();
                        estoqueDeMercadorias.adicionarChaveiroAoEstoque(resultadoIdentificador, resultadoQuantidade);
                    }
                break;
                case 6:
                    System.out.println("\n =============== Quer vender um produto de qual categoria? ===============\n" +
                            "(1)Toalhas\n" +
                            "(2)Chaveiros\n");
                    int resultadoCategoriaVenda = scanner.nextInt();
                    if(resultadoCategoriaVenda==1){
                        estoqueDeMercadorias.listarIdentificadoresDasToalhas();
                        System.out.println("Preciso que você me passe duas informações.");
                        System.out.print("Número do identificador do produto já existente: ");
                        int resultadoIdentificador = scanner.nextInt();
                        System.out.print("Quantidade a ser vendida: ");
                        int resultadoQuantidade = scanner.nextInt();
                        estoqueDeMercadorias.removerToalhaDoEstoque(resultadoIdentificador, resultadoQuantidade);
                        for(int i=0;i<estoqueDeMercadorias.getListaToalhas().size();i++){
                            if(estoqueDeMercadorias.getListaToalhas().get(i).getIdentificador() == resultadoIdentificador){
                                registroDeVendas.registrarVenda(resultadoQuantidade, estoqueDeMercadorias.getListaToalhas().get(i));
                            }
                        }
                    }else if(resultadoCategoriaVenda==2) {
                        estoqueDeMercadorias.listarIdentificadoresDosChaveiros();
                        System.out.println("Preciso que você me passe duas informações.");
                        System.out.print("Número do identificador do produto já existente: ");
                        int resultadoIdentificador = scanner.nextInt();
                        System.out.print("Quantidade a ser vendida: ");
                        int resultadoQuantidade = scanner.nextInt();
                        estoqueDeMercadorias.removerChaveiroDoEstoque(resultadoIdentificador, resultadoQuantidade);
                        for(int i=0;i<estoqueDeMercadorias.getListaChaveiros().size();i++){
                            if(estoqueDeMercadorias.getListaChaveiros().get(i).getIdentificador() == resultadoIdentificador){
                                registroDeVendas.registrarVenda(resultadoQuantidade, estoqueDeMercadorias.getListaChaveiros().get(i));
                            }
                        }
                    }
                    break;
                case 7: registroDeVendas.mostrarRegistroDaVenda();
                break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println("\n---------------------------------------------------------------" +
                                "\nDeseja realizar outra operação? [s/n]");
            resultadoUsuario = scanner.nextLine();
            resultadoUsuario = scanner.nextLine();
            if(resultadoUsuario.toUpperCase(Locale.ROOT).equals("N")){
                System.out.println("\nTem certeza que deseja sair? O programa será encerrado. [s/n]");
                String resultadoUsuarioConfirmacao = scanner.nextLine();
                if(resultadoUsuarioConfirmacao.toUpperCase(Locale.ROOT).equals("S")){
                    resultadoUsuario = "N";
                } else {
                    resultadoUsuario = "S";
                }
            }
        }
    }
}
