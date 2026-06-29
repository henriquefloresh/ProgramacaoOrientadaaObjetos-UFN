import java.io.*;
import java.net.*;
import java.util.ArrayList;

//Servidor responsável por receber os veículos do cliente
public class Servidor {

    public static void main(String[] args) {

        //Porta que sera utilizada para se comunicar
        int porta = 12345;
        ArrayList<Veiculo> lista = VeiculoLista.carregar();

        try {
            //Cria o servidor e fica aguardando conexões
            ServerSocket servidor = new ServerSocket(porta);
            System.out.println("Servidor iniciado na porta " + porta);

            while (true) {

                //Aguarda um cliente se conectar
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado.");

                //Cria os canais de entrada e saída de dados
                ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());

                //Recebe o objeto veiculo enviado pelo cliente
                Veiculo veiculo = (Veiculo) entrada.readObject();

                boolean existe = false;

                //esta verificando se ja existe um veiculo com a mesma placa
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
                    //Atualiza o arquivo com a nova lista
                    VeiculoLista.salvar(lista);
                    saida.writeObject("Cadastro efetuado com sucesso.");
                }

                saida.close();
                entrada.close();
                cliente.close();
            }

        //caso ocorra erro, exibe essa mensagem
        } catch (Exception e) {
            System.out.println("Erro no servidor: " + e.getMessage());
        }
    }
}
