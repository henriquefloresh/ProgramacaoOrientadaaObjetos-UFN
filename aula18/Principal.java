import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Veiculo> lista = VeiculoLista.carregar();

        while (true) {

            System.out.println("\n    MENU    ");
            System.out.println("1 - Cadastrar veículo");
            System.out.println("2 - Alterar quilometragem");
            System.out.println("3 - Excluir veículo");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            int opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = teclado.nextLine();

                    boolean existe = false;

                    for (Veiculo v : lista) {
                        if (v.getPlaca().equalsIgnoreCase(placa)) {
                            existe = true;
                            break;
                        }
                    }

                    if (existe) {
                        System.out.println("Veículo já cadastrado.");
                        break;
                    }

                    System.out.print("Modelo: ");
                    String modelo = teclado.nextLine();

                    System.out.print("Marca: ");
                    String marca = teclado.nextLine();

                    System.out.print("Ano: ");
                    int ano = teclado.nextInt();

                    System.out.print("Quilometragem: ");
                    double km = teclado.nextDouble();

                    Veiculo novo = new Veiculo(placa, modelo, marca, ano, km);

                    lista.add(novo);

                    // Atualiza o arquivo com a nova lista
                    VeiculoLista.salvar(lista);

                    System.out.println("Veículo cadastrado.");

                    break;

                case 2:

                    System.out.print("Digite a placa: ");
                    placa = teclado.nextLine();

                    boolean encontrado = false;

                    // Procura o veículo na lista
                    for (Veiculo v : lista) {

                        if (v.getPlaca().equalsIgnoreCase(placa)) {

                            System.out.print("Nova quilometragem: ");
                            km = teclado.nextDouble();

                            v.setQuilometragem(km);

                            VeiculoLista.salvar(lista);

                            System.out.println("Quilometragem alterada.");

                            encontrado = true;
                            break;
                        }

                    }

                    if (!encontrado) {
                        System.out.println("Veículo não encontrado.");
                    }

                    break;

                case 3:

                    System.out.print("Digite a placa: ");
                    placa = teclado.nextLine();

                    encontrado = false;

                    for (int i = 0; i < lista.size(); i++) {

                        if (lista.get(i).getPlaca().equalsIgnoreCase(placa)) {

                            lista.remove(i);

                            VeiculoLista.salvar(lista);

                            System.out.println("Veículo removido.");

                            encontrado = true;

                            break;
                        }

                    }

                    if (!encontrado) {
                        System.out.println("Veículo não encontrado.");
                    }

                    break;

                case 4:

                    System.out.println("Sistema encerrado.");
                    teclado.close();
                    System.exit(0);

                default:

                    System.out.println("Opção inválida.");

            }

        }

    }

}
