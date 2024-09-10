import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer opcao = 0;

        while (opcao != 4) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Sair");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro número:");
                    Double num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo número:");
                    Double num2 = leitor.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Digite o primeiro número:");
                    num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = leitor.nextDouble();
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Digite o primeiro número:");
                    num1 = leitor.nextDouble();
                    System.out.println("Digite o segundo número:");
                    num2 = leitor.nextDouble();
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitor.close();
    }
    }

