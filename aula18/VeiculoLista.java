import java.io.*;
import java.util.ArrayList;

//Classe responsavel por salvar e ler os veiculos do arquivo
public class VeiculosLista {

    private static final String NOME_ARQUIVO = "veiculos.dat";

    //Salva a lista de veículos no arquivo
    public static void gravar(ArrayList<Veiculo> veiculos) {
        try {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO));
            //Grava toda a lista
            saida.writeObject(veiculos);
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro ao gravar no arquivo.");
        }
    }

    //Le os veiculos do arquivos
    public static ArrayList<Veiculo> ler() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO));
            ArrayList<Veiculo> veiculos = (ArrayList<Veiculo>) entrada.readObject();
            entrada.close();
            return veiculos;
        } catch (Exception erro) {
            //Usa return se o arquivo não existir, então retorna uma lista vazia
            return new ArrayList<Veiculo>();
        }
    }
}
