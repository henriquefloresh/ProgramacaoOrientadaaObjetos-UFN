package pkg;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		System.out.println("Int Digitado: "+n);
		
		int f = 1;
		for(int i = 1; i <= n; i++){
            f = f * i;
    }
		System.out.println("O fatorial de: "+n);
		System.out.println("É: "+f);
		

	}

}
