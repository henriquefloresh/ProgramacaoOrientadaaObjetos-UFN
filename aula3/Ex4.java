package pkg;

public class Ex4 {
    public static void main(String[] args) {

        int soma = 0; // variável fora do laço

        for(int i = 1; i <= 100; i++) {
            soma += i; // acumula o valor de i
        }

        System.out.println("A soma de 1 até 100 é: " + soma);
    }
}
