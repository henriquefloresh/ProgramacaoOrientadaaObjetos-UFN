package pkg1;

public class Carro {
	protected String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibeMsg(){
		System.out.println("Estou dentro da classe carro");
		System.out.println("O carro é: "+nome);

	}

}
