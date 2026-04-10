import java.util.ArrayList;
import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {

        ArrayList<String> nome = new ArrayList<>();
        ArrayList<Double> valorvenda = new ArrayList<>();
        ArrayList<String> placa = new ArrayList<>();
        ArrayList<String> cor = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("Bem vindo ao sistema de cadastro");
            System.out.println("1 - cadastrar carro");
            System.out.println("2 - listar carros cadastrados");
            System.out.println("3 - projeção de venda");
            System.out.println("0 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarveiculo(nome, valorvenda, placa, cor, scanner);
                    break;

                case 2:
                    listarveiculoscadastrados(nome, valorvenda, placa, cor, scanner);
                    break;

                case 3:
                    projeçãodevendas(nome, valorvenda);
                    break;

                case 0:
                    System.out.println("Finalizando sistema");
                    break;

                default:
                    System.out.println("Opção invalida");
            }

            System.out.println("Pressione ENTER para continuar");
            scanner.nextLine();
        }
    }

    public static void cadastrarveiculo(ArrayList<String> nome, ArrayList<Double> valorvenda,
                                        ArrayList<String> placa, ArrayList<String> cor, Scanner scanner) {

        System.out.println("Informe o nome do carro");
        String nomecarro = scanner.nextLine();

        System.out.println("Informe a cor do veiculo");
        String corcarro = scanner.nextLine();

        System.out.println("Informe a placa do veiculo");
        String placacarro = scanner.nextLine();

        System.out.println("Informe o valor de venda");
        double valorvendacarro = scanner.nextDouble();
        scanner.nextLine();

        nome.add(nomecarro);
        valorvenda.add(valorvendacarro);
        placa.add(placacarro);
        cor.add(corcarro);
    }

    public static void listarveiculoscadastrados(ArrayList<String> nome, ArrayList<Double> valorvenda,
                                                 ArrayList<String> placa, ArrayList<String> cor, Scanner scanner) {

        for (int i = 0; i < nome.size(); i++) {

            System.out.println("Veiculo " + (i + 1));
            System.out.println("Nome: " + nome.get(i));
            System.out.println("Cor: " + cor.get(i));
            System.out.println("Placa: " + placa.get(i));
            System.out.println("Valor de venda: " + valorvenda.get(i));
            System.out.println();
        }
    }

    public static void projeçãodevendas(ArrayList<String> nome, ArrayList<Double> valorvenda) {

        double total = 0;

        for (int i = 0; i < valorvenda.size(); i++) {
            total += valorvenda.get(i);
        }

        double comissao = total * 0.20;

        System.out.printf("Valor total das vendas: %.2f\n", total);
        System.out.printf("Comissão (20%%): %.2f\n", comissao);
    
    }
}