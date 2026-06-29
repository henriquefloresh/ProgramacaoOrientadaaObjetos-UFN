import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Servidor {

    public static void main(String[] args) {

        int porta = 12345;
        ArrayList<Veiculo> lista = VeiculoLista.carregar();

        try {
            ServerSocket servidor = new ServerSocket(porta);
            System.out.println("Servidor iniciado na porta " + porta);

            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado.");

                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());

                Veiculo veiculo = (Veiculo) entrada.readObject();

                boolean existe = false;

                for (Veiculo v : lista) {
                    if (v.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
                        existe = true;
                        break;
                    }
                }

                if (existe) {
                    saida.writeObject("Cadastro não efetuado. Placa já existe.");
                } else {
                    lista.add(veiculo);
                    VeiculoLista.salvar(lista);
                    saida.writeObject("Cadastro efetuado com sucesso.");
                }

                saida.close();
                entrada.close();
                cliente.close();
            }

        } catch (Exception e) {
            System.out.println("Erro no servidor: " + e.getMessage());
        }
    }
}
