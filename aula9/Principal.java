package pkg1;

public class Principal {

	public static void main(String[] args) {
		Carro c = new Carro();
		c.nome = "fusca";
		c.exibeMsg();
		
		Onibus o = new Onibus();
		o.nome = "Marcopolo";
		o.setModelo("OM-1519");
		o.exibeMsg();

	}

}
