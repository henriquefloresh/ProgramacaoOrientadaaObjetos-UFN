package pkg1;

public class Onibus extends Carro{
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void exibeMsg() {
		System.out.println("Estou na classe Onibus");
		System.out.println("O Ônibus é: "+nome);
		System.out.println("Modelo: "+modelo);
	}
	 
}
