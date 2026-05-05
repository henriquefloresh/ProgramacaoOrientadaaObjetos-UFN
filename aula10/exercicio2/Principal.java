package pkg1;

public class Principal {
	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		int resultado = c.somar(4, 3);
		System.out.println("Soma: "+resultado);
		resultado = c.somar(4, 7, 9);
		System.out.println("Soma 2: "+resultado);
		double resultado2 = c.somar(3.5, 7);
		System.out.println("Soma 3: "+resultado);
		resultado = c.multiplicar(6, 7);
		System.out.println("Multiplicação: "+resultado);
		resultado2 = c.multiplicar(4.5, 3.8);
		System.out.println("Multiplicação: "+resultado2);
		
	}

}
