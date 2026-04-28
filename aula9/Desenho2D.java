package pkg4;

public class Desenho2D extends Desenho {
	protected int largura;
	protected int altura;
	
	public Desenho2D(int largura, int altura, String nomeAutor) {
		super(nomeAutor);
		this.largura = largura;
		this.altura = altura;
	}
}
