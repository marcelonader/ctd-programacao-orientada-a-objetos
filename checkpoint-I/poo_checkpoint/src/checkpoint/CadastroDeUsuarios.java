package checkpoint;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CadastroDeUsuarios {

    private List<Usuario> listaUsuarios = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public void cadastrarUsuario(){
        System.out.println("\n============================ CADASTRAR CONTA =============================\n");
        System.out.print("Defina um nome para o seu usuário: ");
        String resultadoNome = scanner.nextLine();
        System.out.print("Defina uma senha para o seu usuário: ");
        String resultadoSenha = scanner.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Usuario usuario = new Usuario(resultadoNome, resultadoSenha, dtf.format(LocalDateTime.now()));
        listaUsuarios.add(usuario);
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    private boolean verificarLogin(String nome, String senha){
        int resultado = 0;
        for(int i=0; i<this.getListaUsuarios().size();i++){
            if(this.getListaUsuarios().get(i).getNome().equals(nome) && this.getListaUsuarios().get(i).getSenha().equals(senha))
                resultado = 1;
            else
                resultado = 0;
        }
        if(resultado==1)
            return true;
        else
            return false;
    }

    public boolean logar(){
        System.out.println("\n================================== LOGIN =================================\n");
        System.out.print("Usuário: ");
        String usuarioNome = scanner.nextLine();
        System.out.print("Senha: ");
        String usuarioSenha = scanner.nextLine();
        if(verificarLogin(usuarioNome, usuarioSenha)) {
            System.out.println("Login realizado com sucesso.");
            System.out.println("\n======================= SEJA BEM-VINDO(A) " + usuarioNome.toUpperCase(Locale.ROOT) + " ========================\n");
            return true;
        }else {
            System.out.println("Usuário ou senha não localizados.");
            return false;
        }
    }

}
