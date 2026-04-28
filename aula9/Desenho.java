package pkg4;

public class Desenho {
	protected String nomeAutor;

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Desenho(String nomeAutor) {
		super();
		this.nomeAutor = nomeAutor;
	}
