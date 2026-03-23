package pkg;
//ex5
public class ClassePessoa2 {

	public String nome;
    public int idade;

    // Construtor com nome e idade
    public ClassePessoa2(String n, int i) {
        nome = n;
        idade = i;

        System.out.println("Construtor com nome e idade foi chamado!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    // Construtor apenas com idade
    public ClassePessoa2(int i) {
        idade = i;

        System.out.println("Construtor apenas com idade foi chamado!");
        System.out.println("Idade: " + idade);
    }
}
