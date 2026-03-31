import java.util.Scanner; 

public class Carro {
    private String modelo;
    private int velocidadeAtual;
    private int velocidadeMaxima;

    public Carro(String nomeModelo, int velInicial, int velMaxPermitida) {
        modelo = nomeModelo;
        velocidadeMaxima = velMaxPermitida;
        
        if (velInicial < 0) {
            velocidadeAtual = 0;
        } else if (velInicial > velocidadeMaxima) {
            velocidadeAtual = velocidadeMaxima;
        } else {
            velocidadeAtual = velInicial;
        }
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
            System.out.println("-> " + modelo + " acelerou. Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;
            
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
            System.out.println("-> " + modelo + " freou. Velocidade atual: " + velocidadeAtual + " km/h");
        }
    }

    public boolean atingiuVelocidadeMaxima() {
        return velocidadeAtual == velocidadeMaxima;
    }

    public double calcularTempoViagem(double distancia) {
        if (velocidadeAtual == 0) {
            System.out.println("-> O carro está parado! O tempo de viagem é infinito.");
            return -1; 
        }
        return distancia / velocidadeAtual;
    }


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- MONTANDO SEU CARRO ---");
        
        System.out.print("Digite o modelo do carro: ");
        String inputModelo = teclado.nextLine(); 

        System.out.print("Digite a velocidade máxima permitida (km/h): ");
        int inputMax = teclado.nextInt(); 

        System.out.print("Digite a velocidade inicial do carro (km/h): ");
        int inputInicial = teclado.nextInt();

        
        Carro meuCarro = new Carro(inputModelo, inputInicial, inputMax);
        System.out.println("\nCarro criado com sucesso!\n");

        
        System.out.print("Quantos km/h você quer ACELERAR? ");
        int valorAcelerar = teclado.nextInt();
        meuCarro.acelerar(valorAcelerar);

        System.out.println("Atingiu a velocidade máxima? " + meuCarro.atingiuVelocidadeMaxima());

        System.out.print("\nQual a distância da sua viagem (em km)? ");
        double distanciaViagem = teclado.nextDouble(); 
        double tempo = meuCarro.calcularTempoViagem(distanciaViagem);
        
        if (tempo != -1) {
            System.out.println("-> Tempo estimado de viagem: " + tempo + " horas");
        }

        System.out.print("\nQuantos km/h você quer FREAR? ");
        int valorFrear = teclado.nextInt();
        meuCarro.frear(valorFrear);

        
        teclado.close();
    }
}
