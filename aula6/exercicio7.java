package aula6.pkg;

public class exercicio7 {
	/*
	1. ArithmeticException
	Ocorre quando há erro em operações matemáticas.
	Exemplo: divisão por zero.
	2. NullPointerException
	Ocorre quando você tenta usar um objeto que está null.
	Exemplo: chamar método em uma variável não inicializada.
	3. NumberFormatException
	Ocorre quando tenta converter uma String inválida para número.
	Exemplo: "abc" → Integer.parseInt().
	4. InputMismatchException
	Ocorre quando o tipo digitado no Scanner não corresponde ao esperado.
	Exemplo: digitar texto quando se espera um número.
	5. ArrayIndexOutOfBoundsException
	Ocorre ao acessar posição inválida de um array.
	Exemplo: índice maior que o tamanho do array.
	6. StringIndexOutOfBoundsException
	Ocorre ao acessar índice inválido de uma String.
	7. ClassCastException
	Ocorre ao tentar converter um objeto para um tipo incompatível.
	8. IllegalArgumentException
	Ocorre quando um método recebe argumento inválido.*/
	public static void main(String[] args) {

        // Teste 1: ArithmeticException
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero!");
        }

        // Teste 2: NumberFormatException
        try {
            int numero = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Erro ao converter String para número!");
        }
	}

}
