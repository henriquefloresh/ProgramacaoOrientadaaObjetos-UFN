import java.io.*;
import java.util.ArrayList;

public class VeiculoLista {

    private static final String ARQUIVO = "veiculos.dat";

    public static void salvar(ArrayList<Veiculo> lista) {

        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(ARQUIVO));

            out.writeObject(lista);
            out.close();

        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo.");
        }

    }

    @SuppressWarnings("unchecked")
    public static ArrayList<Veiculo> carregar() {

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return new ArrayList<>();
        }

        try {

            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(ARQUIVO));

            ArrayList<Veiculo> lista = (ArrayList<Veiculo>) in.readObject();

            in.close();

            return lista;

        } catch (Exception e) {
            return new ArrayList<>();
        }

    }

}
