package pkg;
//ex6
public class ClasseAluno {
	public String nome;
    public String matricula;
    public String dataNascimento;
    public int anoIngresso;

    // 1º construtor: nome e matrícula
    public ClasseAluno(String n, String m) {
        nome = n;
        matricula = m;

        System.out.println("Construtor 1 (nome e matrícula)");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
    }

    // 2º construtor: apenas data de nascimento
    public ClasseAluno(String data) {
        dataNascimento = data;

        System.out.println("\nConstrutor 2 (data de nascimento)");
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    // 3º construtor: nome, data de nascimento e ano de ingresso
    public ClasseAluno(String n, String data, int ano) {
        nome = n;
        dataNascimento = data;
        anoIngresso = ano;

        System.out.println("\nConstrutor 3 (nome, data e ano)");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNascimento);
        System.out.println("Ano de ingresso: " + anoIngresso);
    }

}
