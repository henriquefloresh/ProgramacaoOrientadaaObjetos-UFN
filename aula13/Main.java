import java.util.Scanner;

//Classe Base: Computador
class Computador {
 protected String marca;
 private String modelo;

 public Computador(String marca, String modelo) {
     this.marca = marca;
     this.modelo = modelo;
 }

 public String exibeModelo() {
     return this.modelo;
 }
}

//Classe Filha: Notebook
class Notebook extends Computador {
 public Notebook(String marca, String modelo) {
     super(marca, modelo);
 }

 public String exibeMarca() {
     return this.marca;
 }
}

//Classe Filha: Netbook
class Netbook extends Computador {
 public Netbook(String marca, String modelo) {
     super(marca, modelo);
 }

 public String exibeMarca() {
     return this.marca;
 }
}

//Classe Principal para executar o programa
public class Main {
 public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     String modeloPadrao = "Portátil";

     // Entrada e criação do Notebook
     System.out.print("Digite a marca do Notebook: ");
     String marcaNotebook = teclado.nextLine();
     Notebook meuNotebook = new Notebook(marcaNotebook, modeloPadrao);

     // Entrada e criação do Netbook
     System.out.print("Digite a marca do Netbook: ");
     String marcaNetbook = teclado.nextLine();
     Netbook meuNetbook = new Netbook(marcaNetbook, modeloPadrao);

     // Exibição dos resultados
     System.out.println("\n=== RESULTADOS ===");
     System.out.println("Notebook -> Marca: " + meuNotebook.exibeMarca() + " | Modelo: " + meuNotebook.exibeModelo());
     System.out.println("Netbook  -> Marca: " + meuNetbook.exibeMarca() + " | Modelo: " + meuNetbook.exibeModelo());

     teclado.close();
 }
}
