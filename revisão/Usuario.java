package pkg;

import java.util.Scanner;

class Usuario {
    String nomeUsuario;
    String senha;
    boolean logado = false;

    void login(String usuario, String senha) {
        if (this.nomeUsuario.equals(usuario) && this.senha.equals(senha)) {
            logado = true;
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário ou senha incorretos.");
        }
    }

    void logout() {
        logado = false;
        System.out.println("Logout realizado.");
    }

    void exibirStatus() {
        if (logado) {
            System.out.println("Usuário está logado.");
        } else {
            System.out.println("Usuário NÃO está logado.");
        }
    }



    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Usuário definido no código
        Usuario u = new Usuario();
        u.nomeUsuario = "Henrique";
        u.senha = "1234";

        // Entrada de dados
        System.out.print("Digite o usuário: ");
        String usuarioDigitado = teclado.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = teclado.nextLine();

        // Login
        u.login(usuarioDigitado, senhaDigitada);

        // Status
        u.exibirStatus();

        // Logout opcional
        System.out.print("Deseja fazer logout? (s/n): ");
        String opcao = teclado.nextLine();

        if (opcao.equalsIgnoreCase("s")) {
            u.logout();
            u.exibirStatus();
        }

        teclado.close();
    }
}
