import java.io.*;
import java.util.ArrayList;

public class Biblioteca{
    private static final String NOME_ARQUIVO = "livros.txt";

    //Salva a lista de veículos no arquivo
    public static void salvarArquivo(ArrayList<Livro> Livros) {
        try {
            ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO));
            //Grava toda a lista
            saida.writeObject(Livros);
            saida.close();
        } catch (IOException erro) {
            System.out.println("Erro ao gravar no arquivo.");
        }
    }

    //Le os Livros do arquivos
    @SuppressWarnings("unchecked")
    public static ArrayList<Livro> carregarArquivo() {
        try {
            ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO));
            ArrayList<Livro> Livros = (ArrayList<Livro>) entrada.readObject();
            entrada.close();
            return Livros;
        } catch (Exception erro) {
            //Usa return se o arquivo não existir, então retorna uma lista vazia
            return new ArrayList<Livro>();
        }
    }
}
