package revisao;

import java.util.ArrayList;
import java.util.List;

// Classe Pessoa com os atributos solicitados
class Pessoa {
    private String nome;
    private int idade;
    private char sexo; // 'M' para Masculino, 'F' para Feminino

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = Character.toUpperCase(sexo); // Garante que fique sempre maiúsculo
    }

    // Método Getter para acessar o sexo da pessoa
    public char getSexo() {
        return this.sexo;
    }
}

public class ContadorMulheres {

    // Método que recebe a lista e retorna a quantidade de mulheres
    public static int contarMulheres(List<Pessoa> listaDePessoas) {
        int contador = 0;
        
        // Percorre cada pessoa da lista
        for (Pessoa p : listaDePessoas) {
            // Verifica se o sexo é igual a 'F'
            if (p.getSexo() == 'F') {
                contador++;
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        // Criando a lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();

        // Adicionando algumas pessoas na lista (Exemplos)
        pessoas.add(new Pessoa("Ana Silva", 25, 'F'));
        pessoas.add(new Pessoa("Carlos Andrade", 32, 'M'));
        pessoas.add(new Pessoa("Mariana Souza", 19, 'f')); // Funciona mesmo em minúsculo
        pessoas.add(new Pessoa("Roberto Santos", 45, 'M'));
        pessoas.add(new Pessoa("Beatriz Costa", 28, 'F'));

        // Chamando o método e guardando o resultado
        int totalMulheres = contarMulheres(pessoas);

        // Imprimindo a quantidade de mulheres
        System.out.println("Quantidade de mulheres na lista: " + totalMulheres);
    }
}

