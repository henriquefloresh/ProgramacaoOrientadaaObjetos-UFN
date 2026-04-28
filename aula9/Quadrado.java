package pkg4;

public class Quadrado extends Desenho2D{

	protected String desc;
	public Quadrado(int largura, int altura, String desc, String nomeAutor) {
		super(largura, altura, nomeAutor);
		this.desc = desc;
	}
	
	public void exibeDados() {
		System.out.println("Largura: "+this.largura);
		System.out.println("Altura: "+this.altura);
		System.out.println("Desc: "+this.desc);
		System.out.println("Autor: "+this.nomeAutor);
	}
}
