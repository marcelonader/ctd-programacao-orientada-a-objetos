package checkpoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Estoque {

    private List<Produto> listaProdutosGerais = new ArrayList<>();
    private List<Toalha> listaToalhas = new ArrayList<>();
    private List<Chaveiro> listaChaveiros = new ArrayList<>();

    public void cadastrarNovoProduto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quual tipo do produto você deseja cadastrar?\n");
        System.out.println("(1) \"Toalha\"\n(2) \"Chaveiro\"");
        int respostaUsuario = scanner.nextInt();
        if (respostaUsuario == 1) {
            System.out.println("Certo, preciso que você me forneça alguns dados...\n");
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
            System.out.println("Deseja adicionar mais de uma quantidade deste produto? [s/n]");
            String respostaPerguntaQuantidade = scanner.next();
            if (respostaPerguntaQuantidade.toUpperCase(Locale.ROOT).equals("S")) {
                System.out.print("Informe a quantidade que deseja adicionar: ");
                int respostaQuantidade = scanner.nextInt();
                System.out.println("Só um instante...");
                System.out.println("Estou cadastrando no sistema.");
                System.out.println(" ");
                System.out.println("...");
                Produto toalha = new Toalha(respostaUsuarioToalhaNome, respostaUsuarioToalhaPreco, respostaQuantidade, respostaUsuarioToalhaTamanho, respostaUsuarioToalhaCor);
                listaProdutosGerais.add(toalha);
                listaToalhas.add((Toalha) toalha);
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Só um instante...");
                System.out.println("Estou cadastrando no sistema.");
                System.out.println(" ");
                System.out.println("...");
                Produto toalha = new Toalha(respostaUsuarioToalhaNome, respostaUsuarioToalhaPreco, 1, respostaUsuarioToalhaTamanho, respostaUsuarioToalhaCor);
                listaProdutosGerais.add(toalha);
                listaToalhas.add((Toalha) toalha);
                System.out.println("Produto cadastrado com sucesso!");
            }
            System.out.println("Deseja adicionar mais algum produto? [s/n]");
            String respostaPerguntaMaisUmProduto = scanner.next();
            if (respostaPerguntaMaisUmProduto.toUpperCase(Locale.ROOT).equals("S")) {
                cadastrarNovoProduto();
            } else {
                return;
            }
        } else if (respostaUsuario == 2) {
            System.out.println("Certo, preciso que você me forneça alguns dados...\n");
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
            System.out.println("Deseja adicionar mais de uma quantidade deste produto? [s/n]");
            String respostaPerguntaQuantidade = scanner.next();
            if (respostaPerguntaQuantidade.toUpperCase(Locale.ROOT).equals("S")) {
                System.out.print("Informe a quantidade que deseja adicionar: ");
                int respostaQuantidade = scanner.nextInt();
                System.out.println("Só um instante...");
                System.out.println("Estou cadastrando no sistema.");
                System.out.println(" ");
                System.out.println("...");
                Produto chaveiro = new Chaveiro(respostaUsuarioChaveiroNome, respostaUsuarioChaveiroPreco, respostaQuantidade, respostaUsuarioChaveiroTamanho, respostaUsuarioChaveiroMaterial);
                listaProdutosGerais.add(chaveiro);
                listaChaveiros.add((Chaveiro) chaveiro);
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Só um instante...");
                System.out.println("Estou cadastrando no sistema.");
                System.out.println(" ");
                System.out.println("...");
                Produto chaveiro = new Chaveiro(respostaUsuarioChaveiroNome, respostaUsuarioChaveiroPreco, 1, respostaUsuarioChaveiroTamanho, respostaUsuarioChaveiroMaterial);
                listaProdutosGerais.add(chaveiro);
                listaChaveiros.add((Chaveiro) chaveiro);
                System.out.println("Produto cadastrado com sucesso!");
            }
            System.out.println("Deseja adicionar mais algum produto? [s/n]");
            String respostaPerguntaMaisUmProduto = scanner.next();

            if (respostaPerguntaMaisUmProduto.toUpperCase(Locale.ROOT).equals("S")) {
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
        System.out.println("\n====================== PRODUTOS EM ESTOQUE ======================\n");
        if (listaProdutosGerais.size() == 0) {
            System.out.println("Não há produtos em estoque.");
        } else {
            for (int i = 0; i < listaProdutosGerais.size(); i++) {
                System.out.println("\n=============== Produto nº " + (i + 1) + " ===============\n" + listaProdutosGerais.get(i));
            }
        }
    }

    public void listarToalhas() {
        System.out.println("\n====================== TOALHAS EM ESTOQUE ======================\n");
        if (listaToalhas.size() == 0) {
            System.out.println("Não há produtos em estoque.");
        } else {
            for (int i = 0; i < listaToalhas.size(); i++) {
                System.out.println("\n=============== Produto nº " + (i + 1) + " ===============\n" + listaToalhas.get(i));
            }
        }
    }

    public void listarChaveiros() {
        System.out.println("\n====================== CHAVEIROS EM ESTOQUE ======================\n");
        if (listaChaveiros.size() == 0) {
            System.out.println("Não há produtos em estoque.");
        } else {
            for (int i = 0; i < listaChaveiros.size(); i++) {
                System.out.println("\n=============== Produto nº " + (i + 1) + " ===============\n" + listaChaveiros.get(i));
            }
        }
    }

    public void adicionarToalhaAoEstoque(int identificador, int quantidade) {
        if (listaToalhas.size() == 0) {
            System.out.println("Não há toalhas no estoque.");
        } else {
            int count = 0;
            for (int i = 0; i < listaToalhas.size(); i++) {
                if (listaToalhas.get(i).getIdentificador() == identificador) {
                    listaToalhas.get(i).adicionarProduto(quantidade);
                } else {
                    count++;
                }
            }
            if (count == listaToalhas.size()) {
                System.out.println("Identificador não localizado.");
            }
        }
    }

    public void removerToalhaDoEstoque(int identificador, int quantidade) {
        if (listaToalhas.size() == 0) {
            System.out.println("Não há toalhas no estoque.");
        } else {
            int count = 0;
            for (int i = 0; i < listaToalhas.size(); i++) {
                if (listaToalhas.get(i).getIdentificador() == identificador) {
                    listaToalhas.get(i).venderProduto(quantidade);
                } else {
                    count++;
                }
            }
            if (count == listaToalhas.size()) {
                System.out.println("Identificador não localizado.");
            }
        }
    }

    public void adicionarChaveiroAoEstoque(int identificador, int quantidade) {
        if (listaChaveiros.size() == 0) {
            System.out.println("Não há chaveiros no estoque.");
        } else {
            int count = 0;
            for (int i = 0; i < listaChaveiros.size(); i++) {
                if (listaChaveiros.get(i).getIdentificador() == identificador) {
                    listaChaveiros.get(i).adicionarProduto(quantidade);
                } else {
                    count++;
                }
            }
            if (count == listaChaveiros.size()) {
                System.out.println("Identificador não localizado.");
            }
        }
    }

    public void removerChaveiroDoEstoque(int identificador, int quantidade) {
        if (listaChaveiros.size() == 0) {
            System.out.println("Não há chaveiros no estoque.");
        } else {
            int count = 0;
            for (int i = 0; i < listaChaveiros.size(); i++) {
                if (listaChaveiros.get(i).getIdentificador() == identificador) {
                    listaChaveiros.get(i).venderProduto(quantidade);
                } else {
                    count++;
                }
            }
            if (count == listaChaveiros.size()) {
                System.out.println("Identificador não localizado.");
            }
        }
    }

    public void listarIdentificadoresDasToalhas() {
        System.out.println("\n====================== Identificadores das toalhas ======================\n");
        for (int i = 0; i < listaToalhas.size(); i++) {
            System.out.println("\n====================== Produto nº " + (i + 1) + " ======================\n" +
                    "Nome do produto: " + listaToalhas.get(i).getNome() +
                    "\nNúmero do identificador: " + listaToalhas.get(i).getIdentificador() +
                    "\nQuantidade em estoque: " + listaToalhas.get(i).getQuantidade() +
                    "\n ------------------------------------------------------------------\n"
            );
        }
    }

    public void listarIdentificadoresDosChaveiros() {
        System.out.println("\n====================== Identificadores dos chaveiros ======================\n");
            for (int i = 0; i < listaChaveiros.size(); i++) {
                System.out.println("\n====================== Produto nº " + (i + 1) + " ======================\n" +
                                "Nome do produto: " + listaChaveiros.get(i).getNome()+
                                "\nNúmero do identificador: " + listaChaveiros.get(i).getIdentificador() +
                                "\nQuantidade em estoque: " + listaChaveiros.get(i).getQuantidade() +
                                "\n ------------------------------------------------------------------\n"
                );
            }
    }

    public List<Produto> getListaProdutosGerais() {
        return listaProdutosGerais;
    }

    public void setListaProdutosGerais(List<Produto> listaProdutosGerais) {
        this.listaProdutosGerais = listaProdutosGerais;
    }

    public List<Toalha> getListaToalhas() {
        return listaToalhas;
    }

    public void setListaToalhas(List<Toalha> listaToalhas) {
        this.listaToalhas = listaToalhas;
    }

    public List<Chaveiro> getListaChaveiros() {
        return listaChaveiros;
    }

    public void setListaChaveiros(List<Chaveiro> listaChaveiros) {
        this.listaChaveiros = listaChaveiros;
    }
}