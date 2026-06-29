import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Placa: ");
            String placa = sc.nextLine();

            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Marca: ");
            String marca = sc.nextLine();

            System.out.print("Ano de fabricação: ");
            int ano = sc.nextInt();

            System.out.print("Quilometragem: ");
            double km = sc.nextDouble();

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
            sc.close();

        } catch (Exception e) {
            System.out.println("Erro no cliente: " + e.getMessage());
        }
    }
}
