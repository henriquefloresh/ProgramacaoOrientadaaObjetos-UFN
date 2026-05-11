import java.util.Scanner;

// Classe base
class Computador {
    protected String marca;
    private String modelo;

    // Construtor
    public Computador(String marca) {
        this.marca = marca;
        this.modelo = "Portátil";
    }

    // Método para exibir o modelo
    public String exibeModelo() {
        return modelo;
    }
}

// Classe herdadeira Notebook
class Notebook extends Computador {

    public Notebook(String marca) {
        super(marca);
    }

    // Método para exibir a marca
    public String exibeMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do Notebook: ");
        String marca = sc.nextLine();

        Notebook notebook = new Notebook(marca);

        System.out.println("Marca: " + notebook.exibeMarca());
        System.out.println("Modelo: " + notebook.exibeModelo());

        sc.close();
    }
}

// Classe herdadeira Netbook
class Netbook extends Computador {

    public Netbook(String marca) {
        super(marca);
    }

    // Método para exibir a marca
    public String exibeMarca() {
        return marca;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a marca do Netbook: ");
        String marca = sc.nextLine();

        Netbook netbook = new Netbook(marca);

        System.out.println("Marca: " + netbook.exibeMarca());
        System.out.println("Modelo: " + netbook.exibeModelo());

        sc.close();
    }
}
