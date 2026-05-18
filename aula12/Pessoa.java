import java.util.ArrayList;

class Pessoa {
    String nome;
    int idade;
    String sexo;

    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Método para contar mulheres
    public static int contarMulheres(ArrayList<Pessoa> pessoas) {
        int quantidade = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa.sexo.equalsIgnoreCase("Feminino")) {
                quantidade++;
            }
        }

        return quantidade;
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando a lista de pessoas
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Adicionando pessoas na lista
        pessoas.add(new Pessoa("Ana", 22, "Feminino"));
        pessoas.add(new Pessoa("Carlos", 30, "Masculino"));
        pessoas.add(new Pessoa("Juliana", 25, "Feminino"));
        pessoas.add(new Pessoa("Pedro", 28, "Masculino"));

        // Chamando o método
        int quantidadeMulheres = Pessoa.contarMulheres(pessoas);

        // Exibindo o resultado
        System.out.println("Quantidade de mulheres: " + quantidadeMulheres);
    }
}
