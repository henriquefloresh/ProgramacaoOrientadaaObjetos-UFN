import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Placa: ");
            String placa = teclado.nextLine();

            System.out.print("Modelo: ");
            String modelo = teclado.nextLine();

            System.out.print("Marca: ");
            String marca = teclado.nextLine();

            System.out.print("Ano de fabricação: ");
            int ano = teclado.nextInt();

            System.out.print("Quilometragem: ");
            double km = teclado.nextDouble();

            Veiculo veiculo = new Veiculo(placa, modelo, marca, ano, km);

            Socket socket = new Socket("localhost", 12345);

            ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream entrada = new ObjectInputStream(socket.getInputStream());

            saida.writeObject(veiculo);

            String resposta = (String) entrada.readObject();

            System.out.println("Resposta do servidor: " + resposta);

            saida.close();
            entrada.close();
            socket.close();
            teclado.close();

        } catch (Exception e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
    }
}
