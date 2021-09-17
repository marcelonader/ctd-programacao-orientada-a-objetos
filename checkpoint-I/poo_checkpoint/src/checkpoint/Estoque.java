package checkpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Estoque {

    private List<Produto> listaProdutosGerais = new ArrayList<>();
    private List<Toalha> listaToalhas = new ArrayList<>();
    private List<Chaveiro> listaChaveiros = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    RegistroDeVendas registroDeVendas = new RegistroDeVendas();

    public void cadastrarNovoProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n============ Qual o tipo do produto que você deseja cadastrar? ===========\n");
        System.out.println("(1) \"Toalha\"\n(2) \"Chaveiro\"");
        System.out.print("Resposta: ");
        int respostaUsuario = scanner.nextInt();
        if (respostaUsuario == 1) {
            System.out.println("\nCerto, preciso que você me forneça alguns dados...\n");
            System.out.print("Nome do produto: ");
            String respostaUsuarioToalhaNome = scanner.nextLine();
            respostaUsuarioToalhaNome = scanner.nextLine();
            System.out.print("Preço do produto: ");
            double respostaUsuarioToalhaPreco = scanner.nextDouble();
            System.out.print("Cor do produto: ");
            String respostaUsuarioToalhaCor = scanner.nextLine();
            respostaUsuarioToalhaCor = scanner.nextLine();
            System.out.print("Tamanho do produto [p/m/g]: ");
            String respostaUsuarioToalhaTamanho = scanner.nextLine();
            System.out.println("\n====== Deseja adicionar mais de uma quantidade deste produto? [s/n] ======");
            System.out.print("Resposta: ");
            String respostaPerguntaQuantidade = scanner.next();
            if (respostaPerguntaQuantidade.trim().toUpperCase(Locale.ROOT).equals("S") || respostaPerguntaQuantidade.trim().toUpperCase(Locale.ROOT).equals("SIM")) {
                System.out.print("\nInforme a quantidade que deseja adicionar: ");
                int respostaQuantidade = scanner.nextInt();
                System.out.println("Só um instante...\n\n...");
                Produto toalha = new Toalha(respostaUsuarioToalhaNome, respostaUsuarioToalhaPreco, respostaQuantidade, respostaUsuarioToalhaTamanho, respostaUsuarioToalhaCor);
                listaProdutosGerais.add(toalha);
                listaToalhas.add((Toalha) toalha);
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Só um instante...\n\n...");
                Produto toalha = new Toalha(respostaUsuarioToalhaNome, respostaUsuarioToalhaPreco, 1, respostaUsuarioToalhaTamanho, respostaUsuarioToalhaCor);
                listaProdutosGerais.add(toalha);
                listaToalhas.add((Toalha) toalha);
                System.out.println("Produto cadastrado com sucesso!");
            }
            System.out.println("\n=============== Deseja adicionar mais algum produto? [s/n] ===============\n");
            String respostaPerguntaMaisUmProduto = scanner.next();
            if (respostaPerguntaMaisUmProduto.trim().toUpperCase(Locale.ROOT).equals("S") || respostaPerguntaMaisUmProduto.trim().toUpperCase(Locale.ROOT).equals("SIM")) {
                cadastrarNovoProduto();
            } else {
                return;
            }
        } else if (respostaUsuario == 2) {
            System.out.println("\nCerto, preciso que você me forneça alguns dados...\n");
            System.out.print("Nome do produto: ");
            String respostaUsuarioChaveiroNome = scanner.nextLine();
            respostaUsuarioChaveiroNome = scanner.nextLine();
            System.out.print("Preço do produto: ");
            double respostaUsuarioChaveiroPreco = scanner.nextDouble();
            System.out.print("Material do produto: ");
            String respostaUsuarioChaveiroMaterial = scanner.nextLine();
            respostaUsuarioChaveiroMaterial = scanner.nextLine();
            System.out.print("Tamanho do produto [p/m/g]: ");
            String respostaUsuarioChaveiroTamanho = scanner.nextLine();
            System.out.println("\n====== Deseja adicionar mais de uma quantidade deste produto? [s/n] ======");
            System.out.print("Resposta: ");
            String respostaPerguntaQuantidade = scanner.next();
            if (respostaPerguntaQuantidade.trim().toUpperCase(Locale.ROOT).equals("S") || respostaPerguntaQuantidade.trim().toUpperCase(Locale.ROOT).equals("SIM")) {
                System.out.print("\nInforme a quantidade que deseja adicionar: ");
                int respostaQuantidade = scanner.nextInt();
                System.out.println("Só um instante...\n\n...");
                Produto chaveiro = new Chaveiro(respostaUsuarioChaveiroNome, respostaUsuarioChaveiroPreco, respostaQuantidade, respostaUsuarioChaveiroTamanho, respostaUsuarioChaveiroMaterial);
                listaProdutosGerais.add(chaveiro);
                listaChaveiros.add((Chaveiro) chaveiro);
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Só um instante...\n\n...");
                Produto chaveiro = new Chaveiro(respostaUsuarioChaveiroNome, respostaUsuarioChaveiroPreco, 1, respostaUsuarioChaveiroTamanho, respostaUsuarioChaveiroMaterial);
                listaProdutosGerais.add(chaveiro);
                listaChaveiros.add((Chaveiro) chaveiro);
                System.out.println("Produto cadastrado com sucesso!");
            }
            System.out.println("\n=============== Deseja adicionar mais algum produto? [s/n] ===============\n");
            System.out.print("Resposta: ");
            String respostaPerguntaMaisUmProduto = scanner.next();

            if (respostaPerguntaMaisUmProduto.trim().toUpperCase(Locale.ROOT).equals("S") || respostaPerguntaMaisUmProduto.trim().toUpperCase(Locale.ROOT).equals("SIM")) {
                cadastrarNovoProduto();
            } else {
                return;
            }

        } else {
            System.out.println("Não foi possível cadastrar o produto.");
            System.out.println("Erro: Produto Inválido.");
        }
    }


    public void listarTodosOsProdutos() {

        System.out.println("\n=========================== PRODUTOS EM ESTOQUE ==========================\n");
        if (listaProdutosGerais.size() == 0) {
            System.out.println("Não há produtos em estoque.");
        } else {
            for (int i = 0; i < listaProdutosGerais.size(); i++) {
                System.out.println("\n======================= Produto nº " + (i + 1) + " =======================\n" + listaProdutosGerais.get(i));
            }
        }
    }

    public void listarToalhas() {
        System.out.println("\n=========================== TOALHAS EM ESTOQUE ===========================\n");
        if (listaToalhas.size() == 0) {
            System.out.println("Não há produtos em estoque.");
        } else {
            for (int i = 0; i < listaToalhas.size(); i++) {
                System.out.println("\n======================= Produto nº " + (i + 1) + " =======================\n" + listaToalhas.get(i));
            }
        }
    }

    public void listarChaveiros() {
        System.out.println("\n========================== CHAVEIROS EM ESTOQUE ==========================\n");
        if (listaChaveiros.size() == 0) {
            System.out.println("Não há produtos em estoque.");
        } else {
            for (int i = 0; i < listaChaveiros.size(); i++) {
                System.out.println("\n======================= Produto nº " + (i + 1) + " =======================\n" + listaChaveiros.get(i));
            }
        }
    }

    public void adicionarItemAoEstoque() {
        System.out.println("\n=================== Em qual categoria deseja adicionar? ==================\n" +
                "(1)Toalhas\n" +
                "(2)Chaveiros\n");
        System.out.print("Resposta: ");
        int resultadoCategoria = scanner.nextInt();
        if (resultadoCategoria == 1) {
            if (listaToalhas.size() == 0) {
                System.out.println("\nNão há toalhas no estoque.");
            } else {
                int count = 0;
                this.listarIdentificadoresDasToalhas();
                System.out.println("\nPreciso que você me passe duas informações:\n");
                System.out.print("Número do identificador do produto que será adicionado: ");
                int resultadoIdentificador = scanner.nextInt();
                System.out.print("Quantidade a ser adicionada: ");
                int resultadoQuantidade = scanner.nextInt();
                for (int i = 0; i < listaToalhas.size(); i++) {
                    if (listaToalhas.get(i).getIdentificador() == resultadoIdentificador) {
                        listaToalhas.get(i).adicionarProduto(resultadoQuantidade);
                        System.out.print("Item adicionado com sucesso.");
                    } else {
                        count++;
                    }
                }
                if (count == listaToalhas.size()) {
                    System.out.println("\nIdentificador não localizado.");
                }
            }
        } else if (resultadoCategoria == 2) {
            if (listaChaveiros.size() == 0) {
                System.out.println("\nNão há chaveiros no estoque.");
            } else {
                int count = 0;
                this.listarIdentificadoresDosChaveiros();
                System.out.println("\nPreciso que você me passe duas informações:\n");
                System.out.print("Número do identificador do produto que será adicionado: ");
                int resultadoIdentificador = scanner.nextInt();
                System.out.print("Quantidade a ser adicionada: ");
                int resultadoQuantidade = scanner.nextInt();
                for (int i = 0; i < listaChaveiros.size(); i++) {
                    if (listaChaveiros.get(i).getIdentificador() == resultadoIdentificador) {
                        listaChaveiros.get(i).adicionarProduto(resultadoQuantidade);
                        System.out.print("Item adicionado com sucesso.");
                    } else {
                        count++;
                    }
                }
                if (count == listaChaveiros.size()) {
                    System.out.println("\nIdentificador não localizado.");
                }
            }
        }
    }


    public void venderItemDoEstoque() {
        System.out.println("\n =============== Quer vender um produto de qual categoria? ===============\n" +
                "(1)Toalhas\n" +
                "(2)Chaveiros\n");
        System.out.print("Resposta: ");
        int resultadoCategoriaVenda = scanner.nextInt();
        if (resultadoCategoriaVenda == 1) {
            this.listarIdentificadoresDasToalhas();
            System.out.println("\nPreciso que você me passe duas informações:\n");
            System.out.print("Número do identificador do produto que será vendido: ");
            int resultadoIdentificador = scanner.nextInt();
            System.out.print("Quantidade a ser vendida: ");
            int resultadoQuantidade = scanner.nextInt();
            for (int i = 0; i < this.getListaToalhas().size(); i++) {
                if (this.getListaToalhas().get(i).getIdentificador() == resultadoIdentificador) {
                    registroDeVendas.registrarVenda(resultadoQuantidade, this.getListaToalhas().get(i));
                }
            }
            if (listaToalhas.size() == 0) {
                System.out.println("\nNão há toalhas no estoque.");
            } else {
                int count = 0;
                for (int i = 0; i < listaToalhas.size(); i++) {
                    if (listaToalhas.get(i).getIdentificador() == resultadoIdentificador) {
                        listaToalhas.get(i).venderProduto(resultadoQuantidade);
                    } else {
                        count++;
                    }
                }
                if (count == listaToalhas.size()) {
                    System.out.println("\nIdentificador não localizado.");
                }

            }
            } else if (resultadoCategoriaVenda == 2) {
                this.listarIdentificadoresDasToalhas();
                System.out.println("\nPreciso que você me passe duas informações:\n");
                System.out.print("Número do identificador do produto que será vendido: ");
                int resultadoIdentificador = scanner.nextInt();
                System.out.print("Quantidade a ser vendida: ");
                int resultadoQuantidade = scanner.nextInt();
                for (int i = 0; i < this.getListaChaveiros().size(); i++) {
                    if (this.getListaChaveiros().get(i).getIdentificador() == resultadoIdentificador) {
                        registroDeVendas.registrarVenda(resultadoQuantidade, this.getListaChaveiros().get(i));
                    }
                }
                if (listaChaveiros.size() == 0) {
                    System.out.println("\nNão há chaveiros no estoque.");
                } else {
                    int count = 0;
                    for (int i = 0; i < listaChaveiros.size(); i++) {
                        if (listaChaveiros.get(i).getIdentificador() == resultadoIdentificador) {
                            listaChaveiros.get(i).venderProduto(resultadoQuantidade);
                        } else {
                            count++;
                        }
                    }
                    if (count == listaChaveiros.size()) {
                        System.out.println("\nIdentificador não localizado.");
                    }

            }
        }
    }



        public void listarIdentificadoresDasToalhas () {
            System.out.println("\n======================= Identificadores das toalhas ======================\n");
            for (int i = 0; i < listaToalhas.size(); i++) {
                System.out.println("\n======================== Produto nº " + (i + 1) + " ========================\n" +
                        "Nome do produto: " + listaToalhas.get(i).getNome() +
                        "\nNúmero do identificador: " + listaToalhas.get(i).getIdentificador() +
                        "\nQuantidade em estoque: " + listaToalhas.get(i).getQuantidade() +
                        "\n--------------------------------------------------------------------------\n"
                );
            }
        }

        public void listarIdentificadoresDosChaveiros () {
            System.out.println("\n====================== Identificadores dos chaveiros =====================\n");
            for (int i = 0; i < listaChaveiros.size(); i++) {
                System.out.println("\n======================== Produto nº " + (i + 1) + " ========================\n" +
                        "Nome do produto: " + listaChaveiros.get(i).getNome() +
                        "\nNúmero do identificador: " + listaChaveiros.get(i).getIdentificador() +
                        "\nQuantidade em estoque: " + listaChaveiros.get(i).getQuantidade() +
                        "\n--------------------------------------------------------------------------\n"
                );
            }
        }

        public List<Produto> getListaProdutosGerais () {
            return listaProdutosGerais;
        }

        public void setListaProdutosGerais (List < Produto > listaProdutosGerais) {
            this.listaProdutosGerais = listaProdutosGerais;
        }

        public List<Toalha> getListaToalhas () {
            return listaToalhas;
        }

        public void setListaToalhas (List < Toalha > listaToalhas) {
            this.listaToalhas = listaToalhas;
        }

        public List<Chaveiro> getListaChaveiros () {
            return listaChaveiros;
        }

        public void setListaChaveiros (List < Chaveiro > listaChaveiros) {
            this.listaChaveiros = listaChaveiros;
        }
    }
