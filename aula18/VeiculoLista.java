import java.io.*;
import java.util.ArrayList;

public class VeiculosLista {

    private static final String NOME_ARQUIVO = "veiculos.dat";

    public static void gravar(ArrayList<Veiculo> veiculos) {
        try {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO));
            saida.writeObject(veiculos);
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro ao gravar no arquivo.");
        }
    }

    public static ArrayList<Veiculo> ler() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO));
            ArrayList<Veiculo> veiculos = (ArrayList<Veiculo>) entrada.readObject();
            entrada.close();
            return veiculos;
        } catch (Exception erro) {
            return new ArrayList<Veiculo>();
        }
    }
}
