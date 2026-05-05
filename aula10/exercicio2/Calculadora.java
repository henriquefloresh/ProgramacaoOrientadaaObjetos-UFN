package pkg1;

public class Calculadora {
	
	public int somar(int x, int y) {
		System.out.println("Estou no int");
		return x + y;
	}
	
	public int somar(int x, int y, int z) {
		System.out.println("Estou no int");
		return x + y + z;
	}
	
	public double somar(double x, double y ) {
		System.out.println("Estou no double");
		return x + y;
	}
	
	public int multiplicar(int x, int y) {
		System.out.println("Estou no int");
		return x * y;
	}
	
	public double multiplicar(double x, double y) {
		System.out.println("Estou no double");
		return x * y;
	}
	

}
