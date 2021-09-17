package checkpoint;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.time.format.DateTimeFormatter;

public class RegistroDeVendas {

    private List<Venda> listaVendas = new ArrayList<>();

    public void registrarVenda(int quantidade, Produto produto){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            Venda venda = new Venda(dtf.format(LocalDateTime.now()), produto.getNome(), quantidade, produto.getPreco(), produto.getPreco()*quantidade);
            listaVendas.add(venda);
    }

    public void mostrarRegistroDaVenda() {
            double valorTotal=0;
            System.out.println("\n===================== REGISTRO DAS VENDAS REALIZADAS =====================\n");
            if (listaVendas.size() == 0) {
                System.out.println("Não foi localizado nenhum registro de vendas.");
            } else {
                for (int i = 0; i < listaVendas.size(); i++) {
                    valorTotal+=listaVendas.get(i).getPrecoTotal();
                    System.out.println("\n=============== Venda "+(i+1)+ " realizada em: " +listaVendas.get(i).getDataDaVenda()+ " ===============\n" + listaVendas.get(i));
                }
                System.out.println("\n========================= VALOR TOTAL DAS VENDAS =========================\n" +
                        "R$ "+valorTotal);
            }
    }
}


